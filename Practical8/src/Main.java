import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CricketWebsite {
    private int score;
    private Lock lock;

    public CricketWebsite() {
        score = 0;
        lock = new ReentrantLock();
    }

    public void updateScore(int newScore) {
        lock.lock();
        try {
            System.out.println("Updating score...");
            Thread.sleep(1000); // Simulating some processing time
            score = newScore;
            System.out.println("Score updated: " + score);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void readScore() {
        lock.lock();
        try {
            System.out.println("Current score: " + score);
        } finally {
            lock.unlock();
        }
    }
}

class ServerThread extends Thread {
    private CricketWebsite website;

    public ServerThread(CricketWebsite website) {
        this.website = website;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Simulating some processing time before updating the score
            website.updateScore(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ClientThread extends Thread {
    private CricketWebsite website;
    private int clientId;

    public ClientThread(CricketWebsite website, int clientId) {
        this.website = website;
        this.clientId = clientId;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(clientId); // Simulating staggered start for clients
            website.readScore();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CricketWebsite website = new CricketWebsite();

        ServerThread serverThread = new ServerThread(website);
        serverThread.start();

        for (int i = 1; i <= 5; i++) {
            ClientThread clientThread = new ClientThread(website, i);
            clientThread.start();
        }
    }
}

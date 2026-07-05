package learningmultithreading;

public class LearningInterThreadCommunication {
    static void main() {

        SharedResource resource = new SharedResource();
        Thread producer = new Thread(new Producer(resource));
        Thread consumer = new Thread(new Consumer(resource));
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {

    SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        int count = 0;
        while (true) {
            sharedResource.setValue(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

class Consumer extends Thread {

    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        int value;
        while (true) {
            value = sharedResource.getValue();
            System.out.println("Consumer: " + value);
        }
    }
}


class SharedResource {
    int value = 0;
    boolean flag = true;

    public synchronized int getValue() {
        int localValue = 0;
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flag = true;
        localValue = value;
        notify();
        return localValue;
    }

    public synchronized void setValue(int value) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.value = value;
        flag = false;
        notify();
    }
}




package learningmultithreading;

public class StudentChallengeProducerConsumerProblem {
    static void main(String[] args) {

        MovieTopic actionMovies = new MovieTopic();
        MovieProducer movieProducer = new MovieProducer("Hitler", actionMovies);
        MovieConsumer consumer1 = new MovieConsumer("Chintu", actionMovies);
        MovieConsumer consumer2 = new MovieConsumer("Guddan", actionMovies);
        MovieConsumer consumer3 = new MovieConsumer("Ladakhi", actionMovies);
        MovieConsumer consumer4 = new MovieConsumer("Gunjandi", actionMovies);
        MovieConsumer consumer5 = new MovieConsumer("Summi-San", actionMovies);

        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();
        movieProducer.start();

        try {
            movieProducer.join();
            consumer1.join();
            consumer2.join();
            consumer3.join();
            consumer4.join();
            consumer5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MovieProducer extends Thread {
    String name;
    MovieTopic movieTopic;

    public MovieProducer(String name, MovieTopic movieTopic) {
        this.name = name;
        this.movieTopic = movieTopic;
    }

    public void run() {
        String[] movies = {"Krish", "Rockstar", "Rehna hai tere dil mein", "Kabhi haan, kabhi na", "Saudagar"};
        for (String movie : movies) {
            movieTopic.produceMovie(movie);
            System.out.println(name + " is producing movie: " + movie);
        }
    }
}

class MovieConsumer extends Thread {
    String name;
    MovieTopic movieTopic;

    public MovieConsumer(String name, MovieTopic movieTopic) {
        this.name = name;
        this.movieTopic = movieTopic;
        movieTopic.audience();
    }

    public void run() {
        do {
            System.out.println(name + " is watching movie: " + movieTopic.consumeMovie());
        } while (!movieTopic.movie.equals("Saudagar"));
    }
}

class MovieTopic {
    String movie;
    int audienceCount = 0;
    int count = 0;
    int audienceWaiting = 0;

    public synchronized void produceMovie(String movie) {
        while (count != 0 || audienceWaiting < audienceCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.movie = movie;
        count = audienceCount;
        audienceWaiting = 0;
        notifyAll();
    }

    public synchronized String consumeMovie() {
        audienceWaiting++;
        notifyAll();
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        count--;
        if (count == 0) {
            notifyAll();
        }
        return this.movie;
    }

    public synchronized void audience() {
        audienceCount++;
    }
}





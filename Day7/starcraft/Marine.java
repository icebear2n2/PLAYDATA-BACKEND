package starcraft;

public class Marine extends Thread{
    private int id;
    Status status = Status.CREATING;
    static int count = 0;
    public Marine() {
        count++;
        id = count;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            status = Status.CREATE;
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "Marine{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}

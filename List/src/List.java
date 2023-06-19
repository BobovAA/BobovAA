public class List {
    private ProfileList head;

    public List() {
        this.head = null;
    }

    public void add(String name, String job, int age){
        ProfileList temp = new ProfileList(name, job, age);
        temp.setNext(head);
        head = temp;
    }

    public void print(){
        ProfileList temp = head;
        String back;
        System.out.println();

        while (temp != null){
            back = "Имя: " + temp.getName() + "\nРабота: " + temp.getJob() + "\nВозраст: " + temp.getAge();
            System.out.println(back);
            temp = temp.getNext();
            System.out.println();
        }
    }
}
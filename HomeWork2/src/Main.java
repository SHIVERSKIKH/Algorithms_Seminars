import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SingleLinkList<Employee> contactList = new SingleLinkList<>();

        contactList.addToEnd(new Employee( "CCCC", "33"));
        contactList.addToEnd(new Employee("AAAAA", "25"));
        contactList.addToEnd(new Employee( "NNNN", "32"));
        contactList.addToEnd(new Employee("EE", "25"));
    

        for (Object employee : contactList) {
            System.out.println(employee);
        }
        contactList.reverse();

        System.out.println("-------------------------------");

        for (Object employee: contactList) {
            System.out.println(employee);
        }
    }

    static class Employee {
        String name;
        String age;

        public Employee( String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" + 
                    " name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
    public static class SingleLinkList<T> implements Iterable {
        ListItem<T> head;
        ListItem<T> tail;

        @Override
        public Iterator iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }

     
        private static class ListItem<T> {
            T data;
            ListItem<T> next;
        }


        public boolean isEmpty() {
            return head == null;
        }


        public void addToEnd(T item) {


            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;

           
            if (isEmpty()) {
                head = newItem;
                tail = newItem;

          
            } else {
                tail.next = newItem;
                tail = newItem;
            }
        }

        // Метод разворота списка
        public void reverse() {
            if (!isEmpty() && head.next != null) { 
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current != null) {
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }
        }
    }
}
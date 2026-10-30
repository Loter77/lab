public class Task6 {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{name: " + name + ", age: " + age + "}";
        }
    }

    public static Student[] getSortedArray(Student[] array, String key) {
        Student[] result = array.clone();  

        int n = result.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                boolean needSwap = false;

                if (key.equals("age")) {
                    needSwap = result[j].age > result[j + 1].age;
                } else if (key.equals("name")) {
                    needSwap = result[j].name.compareTo(result[j + 1].name) > 0;
                }

                if (needSwap) {
                    Student temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Анна", 20),
            new Student("Борис", 18),
            new Student("Виктор", 22),
            new Student("Галина", 19)
        };

        System.out.println("Исходный массив:");
        for (Student s : students) System.out.println(s);

        Student[] sorted = getSortedArray(students, "age");

        System.out.println("\nОтсортированный по возрасту:");
        for (Student s : sorted) System.out.println(s);
    }
}

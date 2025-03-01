package org.example;

public class StudentManagement {

    public static Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    /**
     * Them mot sinh vien vao danh sach.
     * Neu sinh vien da ton tai (so sanh id) thi khong them.
     *
     * @param newStudent la sinh vien can them.
     */
    public static void addStudent(Student newStudent) {
        int i = 0;
        boolean exited = true;
        for (; i < 100; i++) {
            if (students[i] != null) {
                if (students[i].getId() == newStudent.getId()) {
                    exited = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (exited == true) {
            students[i] = newStudent;
        }
    }

    public static String[] listGr;

    /**
     * Lay danh sach cac lop hoc co trong ds sinh vien.
     *
     * @return mang cac lop hoc.
     */
    public static String[] getGr() {
        listGr = new String[100];
        listGr[0] = students[0].getGroup();

        for (int i = 0; i < 100; i++) {
            if (students[i] == null) {
                break;
            }
            for (int j = 0; j < 100; j++) {
                if (listGr[j] == null) {
                    listGr[j] = students[i].getGroup();
                }

                if (students[i].getGroup().equals(listGr[j])) {
                    break;
                }
            }
        }
        return listGr;
    }

    /**
     * Xuat danh sach sinh vien theo lop hoc.
     *
     * @return chuoi co thong tin cac lop hoc va sinh vien thuoc tung lop.
     */
    public static String studentsByGroup() {
        listGr = getGr();
        StringBuilder list;
        list = new StringBuilder();
        for (int i = 0; i < listGr.length; i++) {
            if (listGr[i] == null) {
                break;
            }
            list.append(listGr[i]).append('\n');
            for (int j = i; j < students.length; j++) {
                if (students[j] == null) {
                    break;
                }
                if (students[j].getGroup().equals(listGr[i])) {
                    list.append(students[j].getInfo()).append('\n');
                }
            }
        }
        return list.toString();
    }

    /**
     * Tim vi tri cua sinh vien theo id trong danh sach.
     *
     * @param id ma so sinh vien.
     * @return chi so cua sinh vien trong mang, hoac chi so cuoi neu khong tim thay.
     */
    public static int findid(String id) {
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
        }
        return i;
    }

    /**
     * Xoa sv khoi danh sach theo mssv.
     *
     * @param id ma so sinh vien can xoa.
     */
    public static void removeStudent(String id) {
        for (int i = findid(id); i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
    }


    /**
     * Ham chinh chay chuong trinh, thục hien chuc nang qlsv.
     *
     * @param args la tham so dau vao.
     */
    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Nguyen Van An");
        a.setId("17020001");
        a.setGroup("K62CC");
        a.setEmail("17020001@vnu.edu.vn");

        addStudent(a);

        Student b = new Student();
        b.setName("Nguyen Van B");
        b.setId("17020002");
        b.setGroup("K62CC");
        b.setEmail("17020002@vnu.edu.vn");

        addStudent(b);

        Student c = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        addStudent(c);

        Student d = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        addStudent(d);

        removeStudent("17020004");
        System.out.println(studentsByGroup());
    }
}


package org.example;

/**
 * Lop Student luu tru va quan ly thong tin mot sinh vien.
 */
public class Student {
    /**
     * Ten sinh vien.
     */
    private String name;

    /**
     * Ma so sinh vien.
     */
    private String id;

    /**
     * Lop hoc cua sinh vien.
     */
    private String group;

    /**
     * Dia chi email cua sinh vien.
     */
    private String email;

    /**
     * Ham khoi tao mac dinh cho Student, gan cac gia tri co dinh.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Ham khoi tao Student voi 3 tham so (name, id, email).
     * Group duoc dat mac dinh la "K62CB".
     *
     * @param name ten sinh vien.
     * @param id ma so sinh vien.
     * @param email dia chi email cua sinh vien.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        // Neu muon group mac dinh, gan o day:
        this.group = "K62CB";
    }

    /**
     * Ham khoi tao Student voi 4 tham so (name, id, group, email).
     *
     * @param name ten sinh vien.
     * @param id ma so sinh vien.
     * @param group lop hoc cua sinh vien.
     * @param email dia chi email cua sinh vien.
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    /**
     * Ham khoi tao sao chep tu mot doi tuong Student khac.
     *
     * @param s doi tuong Student can sao chep.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Lay ten sinh vien.
     *
     * @return ten sinh vien.
     */
    public String getName() {
        return name;
    }

    /**
     * Dat ten sinh vien.
     *
     * @param name ten moi cua sinh vien.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lay ma so sinh vien.
     *
     * @return ma so sinh vien.
     */
    public String getId() {
        return id;
    }

    /**
     * Dat ma so sinh vien.
     *
     * @param id ma so sinh vien.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lay lop hoc cua sinh vien.
     *
     * @return lop hoc.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Dat lop hoc cua sinh vien.
     *
     * @param group lop hoc moi.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Lay dia chi email cua sinh vien.
     *
     * @return dia chi email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Dat dia chi email cho sinh vien.
     *
     * @param email dia chi email moi.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Lay thong tin sinh vien theo dinh dang: "name - id - group - email".
     *
     * @return chuoi thong tin sinh vien.
     */
    public String getInfo() {
        return (name + " - " + id + " - " + group + " - " + email);
    }
}

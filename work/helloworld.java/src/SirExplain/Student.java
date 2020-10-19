package SirExplain;

public class Student {
	 Student() {
	        this(-1, "");
	    }

	    Student(int id) {
	        this(id, "");
	    }

	    Student(int idArg, String nameArg) {
	        System.out.println("inside Student 2 args ctr");
	        id = idArg;
	        this.name = nameArg;
	    }

	    private int id;
	    private String name;

	    void setId(int id) {
	        this.id = id;
	    }

	    int getId() {
	        return id;
	    }

	    void setName(String name) {
	        this.name = name;
	    }

	    String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        String str = id + "-" + name;
	        return str;
	    }

	    /**
	     * Student st1=new Student(1,"shivam");
	     * Stude st2=new Studen("1", "shivam");
	     * boolean flag=st1.equals(st2);
	     */
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || !(obj instanceof Student)) {
	            return false;
	        }
	        Student that = (Student) obj;
	        return this.id == that.id;
	    }

}

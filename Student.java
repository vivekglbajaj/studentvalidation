public class Student {
private String name;
private int ROllNo;

Student(String name, int ROllno){
    this.name = name;
    this.ROllNo = ROllno;

}
public void setname(String name){
    this.name = name;
}
public String getname(){
    return name;    

    
}
public void setROllNo(int ROllNo){
    this.ROllNo = ROllNo;
}
public int getROllNo(){
    return ROllNo;
}
public static void display(String name, int ROllNo){
    System.out.println("Name: " + name + "Roll No: " + ROllNo);
}
public String Validate(String name, int ROllNo){
    if(name == " " || ROllNo == 0){
        return "Invalid";
    }
    else{
        return "Valid";
    }
}
public static void main(String[] args) {
    Student student = new Student(" ", 0);
    student.setname("");
    student.setROllNo(0);
    student.display(student.getname(), student.getROllNo());
    System.out.println(student.Validate(student.getname(), student.getROllNo()));
}
}




import java.sql.*;

public class StudentDemo {
    public void getAllStudentDetails(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student";
            String user="root";
            String password="admin";
            Connection connection= DriverManager.getConnection(url,user,password);
            if (connection !=null){
                System.out.println("Connection Established");
            }
            else {
                System.out.println("Not Connected");
            }
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * From Student");
            while (rs .next()){
                String Student_Names = rs.getString(1);
                int Roll_Number = rs.getInt(2);
                String Grades =rs.getString(3);
                int Class=rs.getInt(4);
                String Section =rs.getString(5);
                System.out.println(Student_Names+" "+Roll_Number+" "+Grades+" "+Class+" "+Section);


            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    }


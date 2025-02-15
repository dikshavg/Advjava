package Test;
import java.sql.*;
import java.util.*;
public class DBcon4 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stm=con.createStatement();
			System.out.println("Enter the NonSelect-query(Create/Insert/Update/Delete)");
			String qry = s.nextLine();
			int k = stm.executeUpdate(qry);
			if(k>=0) {
				System.out.println("Query executed Successfully...");
				System.out.println("The value in k : "+k);
			}
			con.close();
		}
		catch(SQLSyntaxErrorException sqe) {
			System.out.println(sqe.getMessage());
		}
		catch(Exception e) {
		e.printStackTrace();
			
	}
	}

}

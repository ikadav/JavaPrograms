package examples.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeSet;

class GetObjectsFromDB {
	public static void main(String args[]) {
		TreeSet tableSet = new TreeSet();
		HashMap tableHash = new HashMap();


		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DrupalDumpMay21", "root", "");
			// here sonoo is database name, root is username and password
			DatabaseMetaData dbmd = con.getMetaData();
			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);
			
		/*	Statement statement = con.createStatement();
			
			ResultSet result = statement.executeQuery("select * from users");
			
			PreparedStatement prepStmt = con.prepareStatement("select * from users where userid = ? and uName = ?");
			
			prepStmt.setInt(1, 100);

			prepStmt.setString(2, "David");
			
			prepStmt.executeQuery();*/
			
			/*ResultSetMetaData metaData = rs.getMetaData();


			//Statement stmt = con.createStatement();
			
			int count = metaData.getColumnCount();
			for (int i = 1; i <= count; i++)
			{
				System.out.println(metaData.getColumnName(i));
			    
			}*/
			
			int i = 0;
			while (rs.next()) {
				String tableName =  rs.getString("TABLE_NAME");
				//System.out.println( "Table Name is " + tableName + " and its columns and meta data as follows..");
				tableSet.add(rs.getString(3));
				ResultSet columns = dbmd.getColumns(null,null, tableName, null);

				while(columns.next())
				{
					Properties tableProps = new Properties();

				    String columnName = columns.getString("COLUMN_NAME");
				    String datatype = columns.getString("DATA_TYPE");
				    String columnsize = columns.getString("COLUMN_SIZE");
				    String decimaldigits = columns.getString("DECIMAL_DIGITS");
				   // System.out.println("Decimal digits are " + decimaldigits);
				    String isNullable = columns.getString("IS_NULLABLE");
				    String is_autoIncrment = columns.getString("IS_AUTOINCREMENT");
				    
				    if (columnName == null)
				    {
				    		columnName = "NOTHING THERE";
				    }
				    if (datatype == null)
				    {
				    		datatype = "NOTHING THERE";
				    }
				    if (columnsize == null)
				    {
				    		columnsize = "NOTHING THERE";
				    }
				    if (decimaldigits == null)
				    {
				    		decimaldigits = "NOTHING THERE";
				    }
				    if (isNullable == null)
				    {
				    		isNullable = "NOTHING THERE";
				    }
				    if (is_autoIncrment == null)
				    {
				    		is_autoIncrment = "NOTHING THERE";
				    }
				    
				    tableProps.put("COLUMN_NAME", columnName);
				    tableProps.put("DATA_TYPE", datatype);
				    tableProps.put("COLUMN_SIZE", columnsize);
				    tableProps.put("DECIMAL_DIGITS", decimaldigits);
				    tableProps.put("IS_NULLABLE", isNullable);
				    tableProps.put("IS_AUTOINCREMENT", is_autoIncrment);
				    //Printing results
				    tableHash.put(tableName, tableProps);
				   // System.out.println(columnName + "---" + datatype + "---" + columnsize + "---" + decimaldigits + "---" + isNullable + "---" + is_autoIncrment);
				}
				i++;
			}

		con.close();
		Iterator<Entry<String, Properties>> it = tableHash.entrySet().iterator();
		while (it.hasNext()) {
				Map.Entry<String, Properties> pair = (Map.Entry<String, Properties>) it.next();
				System.out.println("TABLE NAME in Hash " + pair.getKey());
				Properties tabProps = pair.getValue();
				for (String key : tabProps.stringPropertyNames()) {
					String value = tabProps.getProperty(key);
					System.out.println(key + " is: Value is " + value);
					
					 }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		
	}
}

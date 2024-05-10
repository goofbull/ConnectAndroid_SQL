import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet

import kotlin.jvm.JvmStatic;
import java.sql.SQLException;

class Test {

    fun connection() {
        try {
            val c = DriverManager.getConnection(
                "http://127.0.0.1/openserver/adminer/index.php?username=root&db=customers",
                "root@localhost",
                "root"
            )
            println("OK!")
            val s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)
            val r = s.executeQuery("SELECT 'id', 'customerName', 'position', 'birthDate', 'gender', 'emailAddress' FROM customers")
        }
        catch (e: SQLException) {
            e.printStackTrace()
        }
    }
}
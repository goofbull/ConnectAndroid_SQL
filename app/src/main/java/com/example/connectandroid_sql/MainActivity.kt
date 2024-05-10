package com.example.connectandroid_sql

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Button
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.connectandroid_sql.ui.theme.ConnectAndroid_SQLTheme
//
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : ComponentActivity() {
//
////    Connection connect;
////    String ConnectionResult = "";
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        loadButton.setOnClickListener{
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//
////        val textView = findViewById<TextView>(R.id.textView) as TextView
////        val textView2 = findViewById<TextView>(R.id.textView2) as TextView
////
////        try {
////            ConnectionHelper connectionHelper = new ConnectionHelper();
////            connect = connectionHelper.connectionclass();
////            if(connect!= null){
////                String query = "Select * from Product";
////                Statement st = connect.createStatement();
////                ResultSet rs = st.executeQuery(query);
////            }
////        }
////        catch (Exception ex){
////
////        }
//    }
//}

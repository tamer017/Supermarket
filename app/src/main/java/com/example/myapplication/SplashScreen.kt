package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SplashScreen : AppCompatActivity() {
    private lateinit var AuthFireBase:FirebaseAuth
    private lateinit var CustomerDB: DatabaseReference
    private lateinit var SellerDB: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }

    override fun onStart() {
        CustomerDB= FirebaseDatabase.getInstance().getReference("Customers")
        SellerDB= FirebaseDatabase.getInstance().getReference("Sellers")
        AuthFireBase= FirebaseAuth.getInstance()
        super.onStart()
        if(AuthFireBase.currentUser!=null){
            val id=AuthFireBase.uid.toString()

            SellerDB.get().addOnSuccessListener {
                for (i in it.children){
                    if(i.key.toString()==id){
                        val intentSeller= Intent(this,SellerActivity::class.java)
                        startActivity(intentSeller)
                        finish()
                    }
                }
            }

            CustomerDB.get().addOnSuccessListener {
                for (i in it.children){
                    if(i.key.toString()==id){
                        val intentCustomer=Intent(this,CustomerActivity::class.java)
                        startActivity(intentCustomer)
                        finish()

                    }
                }
            }
        }
        else{
            val intentCustomer=Intent(this,SignIn::class.java)
            startActivity(intentCustomer)
            finish()

        }
    }
}
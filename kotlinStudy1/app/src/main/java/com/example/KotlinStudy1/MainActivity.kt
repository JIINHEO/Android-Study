package com.example.KotlinStudy1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import com.example.KotlinStudy1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //viewbinding
    //private lateinit var binding: ActivityMainBinding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("EditText","현재 입력된 값= ${p0.toString()}")

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("EditText","현재 입력된 값= ${p0.toString()}")

            }

            override fun afterTextChanged(p0: Editable?) {
                Log.d("EditText","현재 입력된 값= ${p0.toString()}")

            }
        })

        //앞에 바인딩 붙여줘야함
        binding.button1.setOnClickListener {
            //val intent = Intent(this, PhotoActivity::class.java)
            Toast.makeText(this, "토스트!!!", Toast.LENGTH_SHORT).show()
            //startActivity(intent)
        }

        binding.catbutton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:112")
            startActivity(intent)

        }


    }
}

////생성자 없는 클래스 호출
//Kotlin()
//
////클래스의 생성자 사용
//KotlinTwo("안녕")
//
////클래스의 프로퍼티와 메서드 사용하기
//val kotlin = KotlinThree()
////메서드를 먼저 출력
//kotlin.printOne()
////프로퍼티에 값을 넣고 출력
//kotlin.one = "Hello"
//kotlin.printOne()
//
////컴패니언 오브젝트 사용하기: 자세히 보면 첫 글자가 대문자임
//KotlinFour.printOne()
//KotlinFour.one = "안녕 나는 4야"
//KotlinFour.printOne()
//
////데이터 클래스 사용하기
//var dataUser = DataUser("Michael", 24)
//var newUser = dataUser.copy()
//newUser.name = "Jane"
//Log.d("abc", "원본 dataUser는 ${dataUser.toString()}")
//Log.d("abc", "복사된 newUser는 ${newUser.toString()}")
//
////viewbinding
//binding = ActivityMainBinding.inflate(layoutInflater)
//setContentView(binding.root)

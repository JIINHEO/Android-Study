
# Android Study - Kotlin   

### π μ΄κ²μ΄ μλλ‘μ΄λλ€ with μ½νλ¦°  
 
    μ½νλ¦° μ΅μ€νμμ΄ deprecated λλ©΄μ μ±μ μμ λ€μ΄ λͺ¨λ λμνμ§ μλλ€. π₯
    μ΄λ₯Ό λμ²΄νλ κ²μΌλ‘ findViewById() κ° μμ§λ§, μ½λμ κ°λμ±μ΄ λ¨μ΄μ§κ³ , μλ―Έμλ μ½λλμ΄ λ§μ΄μ§λ λ±μ λ¨μ λ€μ΄ μκΈ° λλ¬Έμ
    μλλ‘μ΄λ μ€νλμ€ 3.6λ²μ  λΆν° μ κ³΅νκ³  μλ viewBindingμ μ¬μ©ν κ²μ΄λ€.
    
---

## gradle μ€μ 
```kotlin
android {
    ... μλ΅
    buildFeatures {
        viewBinding true
    }
}
```

## viewBinding λμμλ¦¬
    viewBindingμ gradleμ μ€μ νλ κ² λ§μΌλ‘ κ°λ°μκ° μμ±ν λ μ΄μμ νμΌλ€μ λ€μκ³Ό κ°μ κ³΅μμΌλ‘ λͺ¨λ λ°μΈλ©ν΄λμ€λ‘ μλλ³νν¨

    μλλ³νκ³΅μ : λ μ΄μμνμΌλͺ(μ²« κΈμμ μΈλλ° λ€μμλ¬Έμ λλ¬Έμλ‘ λ³ν) + Binding
    μ)
    activity_main.xml = ActivityMainBinding
    activity_sub.xml = ActivitySubBinding
    item_recycler.xml = ItemRecyclerBinding
    
    
---
## μμ 

### 1. basic  
    κΈ°λ³Έ μ½νλ¦° λ¬Έλ²...
    layout, textView, EditText, button, ImageView, toast ...

### 2. Spinner


### 3. Recycler
    RecyclerViewμ View Binding μ μ©
    μ°Έκ³  : https://www.youtube.com/watch?v=cN1UVAeP63c

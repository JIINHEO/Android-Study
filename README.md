
# Android Study - Kotlin   

### 📗 이것이 안드로이드다 with 코틀린  
 
    코틀린 익스텐션이 deprecated 되면서 책의 예제들이 모두 동작하지 않는다. 😥
    이를 대체하는 것으로 findViewById() 가 있지만, 코드의 가독성이 떨어지고, 의미없는 코드량이 많이지는 등의 단점들이 있기 때문에
    안드로이드 스튜디오 3.6버전 부터 제공하고 있는 viewBinding을 사용할것이다.
    
---

## gradle 설정
```kotlin
android {
    ... 생략
    buildFeatures {
        viewBinding true
    }
}
```

## viewBinding 동작원리
    viewBinding은 gradle에 설정하는 것 만으로 개발자가 작성한 레이아웃 파일들을 다음과 같은 공식으로 모두 바인딩클래스로 자동변환함

    자동변환공식 : 레이아웃파일명(첫 글자와 언더바 다음영문을 대문자로 변환) + Binding
    예)
    activity_main.xml = ActivityMainBinding
    activity_sub.xml = ActivitySubBinding
    item_recycler.xml = ItemRecyclerBinding
    
    
---
## 예제

### 1. basic  
    기본 코틀린 문법...
    layout, textView, EditText, button, ImageView, toast ...

### 2. Spinner


### 3. Recycler
    RecyclerView에 View Binding 적용
    참고 : https://www.youtube.com/watch?v=cN1UVAeP63c

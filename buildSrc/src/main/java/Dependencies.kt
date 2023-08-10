object Versions {
    const val core = "1.9.0"
    const val appcompat = "1.6.1"
    const val materialUI = "1.9.0"
    const val constraintlayout = "2.1.4"

    const val testImplJunit = "4.13.2"

    const val androidTestImplJunit = "1.1.5"
    const val androidTestImplEspresso = "3.5.1"

    const val hilt = "2.45"

    const val retrofit = "2.9.0"
    const val gsonConverter = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalarConverter = "2.1.0"

    const val kotlinCoroutines = "1.6.1"

    const val coroutineLifecycleScope = "2.5.1"

    const val glide = "4.12.0"

    const val viewModelDelegate = "1.6.0"

    const val roomDb = "2.4.3"

    const val swipeRefresh = "1.1.0"


}

object Dep {
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val materialUI = "com.google.android.material:material:${Versions.materialUI}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
}

object TestImplDep {
    const val testImplJunit = "junit:junit:${Versions.testImplJunit}"
}

object AndroidTestImplDep {

    const val androidTestImplJunit = "androidx.test.ext:junit:${Versions.androidTestImplJunit}"
    const val androidTestImplEspresso =
        "androidx.test.espresso:espresso-core:${Versions.androidTestImplEspresso}"

}

object DaggerHilt{
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
}

object Retrofit{
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"
    const val okHttp = "com.squareup.okHttp3:okHttp:${Versions.okHttp}"

}



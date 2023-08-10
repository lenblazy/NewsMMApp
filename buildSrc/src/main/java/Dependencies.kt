
object Versions{
    const val core="1.9.0"
    const val appcompat="1.6.1"
    const val materialUI="1.9.0"
    const val constraintlayout="2.1.4"

    const val testImplJunit="4.13.2"

    const val androidTestImplJunit="1.1.5"
    const val androidTestImplEspresso="3.5.1"

}

object Deps {
    const val core="androidx.core:core-ktx:${Versions.core}"
    const val appcompat="androidx.appcompat:appcompat:${Versions.appcompat}"
    const val materialUI="com.google.android.material:material:${Versions.materialUI}"
    const val constraintlayout="androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
}

object TestImplementation{
    const val testImplJunit="junit:junit:${Versions.testImplJunit}"
}

object AndroidTestImplementation{

    const val androidTestImplJunit="androidx.test.ext:junit:${Versions.androidTestImplJunit}"
    const val androidTestImplEspresso="androidx.test.espresso:espresso-core:${Versions.androidTestImplEspresso}"

}

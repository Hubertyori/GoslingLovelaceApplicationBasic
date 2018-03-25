#GoslingLovelace Basic Application

For part 1

![Demo](https://github.com/Hubertyori/GoslingLovelaceApplicationBasic/blob/master/Genymotion%20for%20personal%20use%20-%20Custom%20Phone%20-%207.0.0%20-%20API%2024%20-%20768x1280%20(768x1280%2C%20320dpi)%20-%20192.168.148.101%202018_3_25%2015_38_51_20180325154257.gif)

![Demo](https://github.com/Hubertyori/GoslingLovelaceApplicationBasic/blob/master/Genymotion%20for%20personal%20use%20-%20Custom%20Phone%20-%207.0.0%20-%20API%2024%20-%20768x1280%20(768x1280%2C%20320dpi)%20-%20192.168.148.101%202018_3_25%2015_39_59_20180325154316.gif)

For the function of the record the screen software I can not make the whole process. Because while I replace the AVD's positon, it stop recording. So there are tow GIFs.

The layout is flowing:

    <?xml version="1.0" encoding="utf-8"?>
    <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="studio.opclound.ada_and_james.MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        >
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Ada Lovelance"
            android:textSize="30sp"
            android:gravity="center"/>
        <ImageView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:src="@drawable/ada"
            />
        <TextView
            android:id="@+id/text_ada"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="@string/Ada_Lovelace"
            android:singleLine="false"
            android:textSize="20sp"
            android:scrollbars="vertical"/>
    </LinearLayout>

    </android.support.constraint.ConstraintLayout>
    
and other one

    <?xml version="1.0" encoding="utf-8"?>
    <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="studio.opclound.ada_and_james.MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="James Gosling"
            android:textSize="30sp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <ImageView

                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:src="@drawable/james" />

            <TextView
                android:id="@+id/text_ada"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:scrollbars="vertical"
                android:singleLine="false"
                android:text="@string/James_Gosling"
                android:textSize="20sp" />
        </LinearLayout>


    </LinearLayout>

    </android.support.constraint.ConstraintLayout>

How to make the text slide:
adding those codes in the Oncreat() function

        TextView tv = (TextView) findViewById(R.id.text_ada);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());


![Demo](display/demo.gif)

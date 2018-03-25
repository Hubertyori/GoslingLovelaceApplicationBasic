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

For part 2 


![Demo](Part2.gif)

Part2 is required to change the language when the application in diffirent language enviroument. So there are 3 steps to realise it:

Step1:
Build a new Value file director, if we are design for Chinese. We can set the new file with the name "values-zh-rCN"

step2:
Copy the files in values and set the strings from English to Chinese.

    <resources>
    <string name="app_name">高斯林·勒芙蕾丝应用基础</string>
    <string name="Ada_name">爱达·勒芙蕾丝</string>
    <string name="James_name">詹姆斯·高斯林</string>
    <string name="Ada_Lovelace">奥古斯塔·阿达·金诺尔，洛夫莱斯伯爵夫人(尼·拜伦);1815年12月10日- 1852年11月27日，英国数学家兼作家，主要以她对查尔斯·巴贝奇(Charles Babbage)提出的机械通用计算机——分析引擎——的研究而闻名。她是第一个意识到这台机器的应用程序超出了纯粹的计算能力，并且发布了第一个由这种机器执行的算法。因此，她有时被认为是第一个认识到“计算机”和第一个计算机程序员的全部潜力的人。</string>
    <string name="James_Gosling">詹姆斯·高斯林(James Gosling)从卡尔加里大学(University of Calgary[4])获得了理学学士学位，并获得了卡内基梅隆大学(Carnegie Mellon University)的硕士和博士学位。[2][5][6]在攻读博士学位期间，他编写了一种名为Gosling Emacs的Emacs版本。在加入太阳微系统之前，他在卡内基梅隆大学(Carnegie Mellon University)建立了一个多处理器版本的Unix，用于16路计算机系统[7]。他还开发了几个编译器和邮件系统。</string>
    </resources>
Step3:
In the MainActivity we use the following code to check out what language should we use and set the language.

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String able= getResources().getConfiguration().locale.getCountry();
        if(able.equals("CN")){
            Configuration config = getResources().getConfiguration();
            DisplayMetrics dm = getResources() .getDisplayMetrics();
            config.locale = Locale.SIMPLIFIED_CHINESE;
            getResources().updateConfiguration(config, dm);
        }
        TextView tv = (TextView) findViewById(R.id.text_ada);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
![Demo](display/demo.gif)

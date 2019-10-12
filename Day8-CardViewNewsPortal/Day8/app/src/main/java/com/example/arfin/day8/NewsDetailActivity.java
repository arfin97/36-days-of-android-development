package com.example.arfin.day8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetailActivity extends AppCompatActivity {
    private String news;
    private TextView tvNewsTitle, tvNewsDetail;
    private ImageView ivNewsImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        Intent i = getIntent();
        news = i.getStringExtra("news");

        tvNewsTitle = findViewById(R.id.tvNewsTitle);
        tvNewsDetail = findViewById(R.id.tvNewsDetail);
        ivNewsImage = findViewById(R.id.ivNewsImage);


        if(news.equals("news1")){
            tvNewsTitle.setText("ইউটিউবের প্রতিদ্বন্দ্বী আনছে রাশিয়া");
            tvNewsDetail.setText("ইন্টারনেট জগতে বর্তমানে চাহিদার উপর ভিত্তি করে ইউটিউব এবং ফেইসবুক উভয়েরই ভিডিও স্ট্রিমিং সেবা রয়েছে।\n" +
                    "\n" +
                    "চীনের বেইজিংভিত্তিক প্রতিষ্ঠান বাইটড্যান্সের অনলাইন ভিডিও সেবা টোটিয়াও-এর পথ ধরেই ইয়ানডেক্স এগোচ্ছে বলে উল্লেখ করা হয়েছে প্রতিবেদনে।\n" +
                    "\n" +
                    "ইয়ান্ডেক্স জেন বিভিন্ন বিষয় ধরে ভিডিও কনটেন্ট শ্রেণিবিন্যাস করে থাকে। এই সাইটে ১৫ মিনিট পর্যন্ত দৈর্ঘ্যের ভিডিও আপলোড করতে পারেন ব্লাগাররা। সূত্র জানায়, পরীক্ষামূলক অবস্থাতেই সাইটিট ইতোমধ্যেই বিভিন্ন রকম কন্টেন্ট দিয়ে পূর্ণ হয়ে গিয়েছে। প্রতিদিন এর ভিউ হচ্ছে ২ কোটিরও বেশী এবং ব্যবহারকারী রয়েছে এক কোটি দশ লাখের উপরে। এই আগস্টে ইয়ান্ডেক্স জেন এর দর্শক পাঁচ কোটির কাছে পৌছে গেছে।\n" +
                    "\n" +
                    "বর্তমানে রাশিয়ার প্রায় অর্ধেক জনগনই ইয়ান্ডেক্সের সার্চ ইঞ্জিন ব্যবহার করছে। তবে ডিলয়েটের সম্প্রতি একটি অনুসন্ধানে জানা গিয়েছে সাইটটি এখনও রাশিয়ায় তৃতীয় অবস্থানে রয়েছে যেখানে প্রথম অবস্থানে রয়েছে ইউটিউব এবং পরবর্তীতে রয়েছে সেই দেশের বৃতত্তম সোশাল নেটওয়ার্ক সাইট ভিকনটাক।");
            ivNewsImage.setImageResource(R.drawable.image2);

        }

        if(news.equals("news2")){
            tvNewsTitle.setText("ডোরড্যাশ হ্যাকিং: ৪৯ লাখের তথ্য ফাঁস");
            tvNewsDetail.setText("হ্যাকিংয়ের শিকার হয়েছে মার্কিন যুক্তরাষ্ট্রের খাবার সরবরাহ প্রতিষ্ঠান ডোরড্যাশ। এ ঘটনায় প্রতিষ্ঠানের ৪৯ লাখ গ্রাহক, কর্মী এবং রেস্তোরাঁর তথ্য ফাঁস হয়ে থাকতে পারে বলে আশঙ্কা করা হচ্ছে।\n" +
                    "এক ব্লগ পোষ্টে প্রতিষ্ঠানের পক্ষ থেকে বলা হয়, মে মাসের ৪ তারিখ অননুমোদিত কেউ অবৈধভাবে তাদের সিস্টেমে প্রবেশ করেছে।\n" +
                    "\n" +
                    "রয়টার্সের প্রতিবেদনে বলা হয়, চুরি যাওয়া সম্ভাব্য তথ্যগুলোর মধ্যে রয়েছে ক্রেতাদের কার্ডের শেষ চার অঙ্ক, রেস্টুরেন্ট কর্মীদের ব্যাংক অ্যাকাউন্টের শেষ চার অঙ্ক এবং রেস্তোরাঁর কিছু তথ্য।\n" +
                    "\n" +
                    "প্রতিবেদনে আরও বলা হয় ঝুঁকিতে থাকা তথ্যগুলোর মধ্যে আরও রয়েছে ক্রেতাদের প্রোফাইলের তথ্য যেমন, নাম, ই-মেইল, সরবরাহ ঠিকানা এবং ফোন নাম্বার। এ ছাড়াও প্রায় এক লাখ সরবরাহ কর্মীর লাইসেন্স নাম্বারও বেহাত হয়ে থাকতে পারে বলে আশঙ্কা করা হচ্ছে।\n" +
                    "\n" +
                    "স্যান ফ্রান্সিসকোভিত্তিক প্রতিষ্ঠানটি তথ্য চুরির বিষয়টি জানতে পেরেছে এই মাসের শুরুর দিকেই। প্রতিষ্ঠানটি জানায়, বর্তমানে বিষয়টি নিয়ে তদন্ত চলছে। যে সব ক্রেতা এপ্রিলের ৫ তারিখের পর তাদের সঙ্গে যুক্ত হয়েছেন তাদের কোনো তথ্য চুরি হয়নি।");
            ivNewsImage.setImageResource(R.drawable.image3);


        }
    }
}

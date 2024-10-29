package com.example.wutheringwavescharacterlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wutheringwavescharacterlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val characters = listOf(
            Character("Aalto", getString(R.string.aalto_description), R.drawable.aalto),
            Character("Baizhi", getString(R.string.baizhi_description), R.drawable.baizhi),
            Character("Chalcaro", getString(R.string.chalcaro_description), R.drawable.calcharo),
            Character("Changli", getString(R.string.changli_description), R.drawable.changli),
            Character("Chixia", getString(R.string.chixia_description), R.drawable.chixia),
            Character("Danjin", getString(R.string.danjin_description), R.drawable.danjin),
            Character("Encore", getString(R.string.encore_description), R.drawable.encore),
            Character("Jianxin", getString(R.string.jianxin_description), R.drawable.jianxin),
            Character("Jinshi", getString(R.string.jinshi_description), R.drawable.jinshi),
            Character("Jiyan", getString(R.string.jiyan_description), R.drawable.jiyan),
            Character("Lingyang", getString(R.string.lingyang_description), R.drawable.lingyang),
            Character("Mortefi", getString(R.string.mortefi_description), R.drawable.mortefi),
            Character("Rover", getString(R.string.rover_description), R.drawable.mortefi),
            Character("Sanhua", getString(R.string.sanhua_description), R.drawable.sanhua),
            Character("Shorekeeper", getString(R.string.shorekeeper_description), R.drawable.shorekeeper),
            Character("Taoqi", getString(R.string.taoqi_description), R.drawable.taoqi),
            Character("Verina", getString(R.string.verina_description), R.drawable.verina),
            Character("Xiangli Yao", getString(R.string.xiangliyao_description), R.drawable.xiangliyao),
            Character("Yang Yang", getString(R.string.yangyang_description), R.drawable.yangyang),
            Character("Yinlin", getString(R.string.yinlin_description), R.drawable.yinlin),
            Character("Youhu", getString(R.string.youhu_description), R.drawable.youhu),
            Character("Yuanwu", getString(R.string.yuanwu_description), R.drawable.yuanwu),
            Character("Zhezhi", getString(R.string.zhezhi_description), R.drawable.zhezhi),
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CharacterAdapter(this, characters)
    }
}

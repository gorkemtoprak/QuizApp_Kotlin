package com.example.kotlin_quizapp

import java.util.*


object setData {

    const val name: String = "name"
    const val score: String = "score"

    fun getQuestion(): ArrayList<QuestionList> {
        var que: ArrayList<QuestionList> = arrayListOf<QuestionList>()

        var question1 = QuestionList(
            1,
            "Mustafa Kemal Atatürk’ün Nüfusa Kayıtlı Olduğu İl Hangisidir?",
            "Bursa",
            "Ankara",
            "İstanbul",
            "Gaziantep",
            4
        )
        var question2 = QuestionList(
            2,
            "2003 Yılında Euro Vizyon Şarkı Yarışmasında Ülkemizi Temsil Eden ve Yarışmada Birinci Gelen Sanatçımız Kimdir?",
            "Grup Athena",
            "Sertap Erener",
            "Şebnem Paker",
            "Ajda Pekkan",
            2
        )
        var question3 = QuestionList(
            3,
            "Aşağıdakilerden Hangisi Dünya Sağlık Örgütünün Kısaltılmış İsmidir?",
            "Uhw",
            "Unicef",
            "Who",
            "Nato",
            3
        )
        var question4 = QuestionList(
            4,
            "Aşağıdaki Ülkelerden Hangisinin Nüfusu Daha Fazladır?",
            "İspanya",
            "Fransa",
            "İngiltere",
            "Almanya",
            4
        )

        var question5 = QuestionList(
            5,
            "Tsunami Felaketinde En Fazla Zarar Gören Güney Asya Ülkesi Aşağıdakilerden Hangisidir?",
            "Endonezya",
            "Srilanka",
            "Tayland",
            "Hindistan",
            1
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}
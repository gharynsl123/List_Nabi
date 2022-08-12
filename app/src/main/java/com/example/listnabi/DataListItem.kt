package com.example.listnabi

object DataList {
    val titleItem = arrayOf(
        "Nabi Adam",
        "Nabi Idris",
        "Nabi Nuh",
        "Nabi Hud",
        "Nabi saleh",
        "Nabi Ibrahim",
        "Nabi ismail",
        "Nabi Luth",
        "Nabi ishaq",
        "Nabi yakub",
        "Nabi Yusuf",
        "Nabi Syu’aib",
        "Nabi ayub",
        "Nabi Zulkifli",
        "Nabi musa",
        "Nabi harun",
        "Nabi daud",
        "Nabi Sulaiman",
        "Nabi ilyas",
        "Nabi ilyasa",
        "Nabi yunus",
        "Nabi zakaria",
        "Nabi yahya",
        "Nabi isa",
        "Nabi Muhammad (Rasulullah)",
    )
    val listDataNabi: ArrayList<NabiList>
        get() {
            val listExplore = arrayListOf<NabiList>()
            for (position in titleItem.indices){
                val explore = NabiList(
                    nameEx = titleItem[position],
                )
                listExplore.add(explore)
            }
            return listExplore
        }
}
package com.example.myapp

object CharasData {
    private val charaNames = arrayOf(
        "Tohru Honda",
        "Kyouko Mogami",
        "Komichi Akebi",
        "Renge Miyauchi",
        "Nico Yazawa",
        "Kiyotaka Ayanokouji",
        "Toua Tokuchi",
        "Duke Togo",
        "Kintarou Oe",
        "Arataka Reigen"
    )

    private val charaDetails = arrayOf(
        "She loves to cook and describes herself as an excellent housekeeper. She also has an after-school job as a janitor to pay her tuition fees to avoid being a burden on her grandfather. She is depicted as polite, optimistic, extremely kind, and selfless.",
        "Kyoko is a kind and hardworking girl who always puts others before her. She is shown to be very clever academically, she manages to pass the High School entrance exam with the highest grades, 100%. However, she is a little bit dense and naive.",
        "Komichi is in Class 1, Year 3, attendance number 1. She has a strong yearning for the sailor suit due to a certain reason. She has a bright and straightforward personality, and is really looking forward to school life. She is very good at sports.",
        "A first-grade elementary school student. Renge is always attached to her recorder and likes to make up nicknames for all the characters in the show. She is quite attached to Kaede, to whom she likes to call \"Candy store\".",
        "Nico has been observing Honoka\'s new Idol group for a while but eventually joins them. She has past experiences as an amateur school idol. She likes bossing people around and acting superior, but she also has an energetic and cheeky personality.",
        "He is an inconspicuous and unobtrusive student. He is shown to be extremely intelligent and possesses a profound insight to study the emotions of people around him. Almost everything about his life prior to the entrance exams is unknown.",
        "Toua is a successful gambler, and a pitcher in the game One Outs. After losing a game of One Outs for the first time , he joins the Lycaons with an odd contract, the One Outs contract, that decides Toua\'s pay based on his performance.",
        "A mystery man of undetermined origin, possibility being at least part Japanese, who takes any assignment for any employer (it has been said he has worked for the CIA and the KGB) as long as the right price is given and will always fulfill his contracts.",
        "As a \"Tokyo University Department of Law\" dropout, he is studying the way of life by traveling with his bike through Japan. Although he dropped out, he mastered the entire curriculum.",
        "He is Mob\'s mentor and boss. He is the self-proclaimed \"Greatest Psychic of the 21st Century\" as well as owner and operator of the Spirits and Such Consultation Office. Reigen has few to no qualms about manipulating clients, enemies, and allies. "
    )

    private val charaAnime = arrayOf(
        "Fruit Basket",
        "Skip Beat",
        "Akebi-chan no Sailor-fuku",
        "Non-non Biyori",
        "Love Live! School Idol Project",
        "Classroom of the Elite",
        "One Outs",
        "Golgo 13",
        "Golden Boy",
        "Mob Psychoo"
    )

    private val charasImages = intArrayOf(
        R.drawable.tohru,
        R.drawable.mogami,
        R.drawable.akebi,
        R.drawable.renge,
        R.drawable.nico,
        R.drawable.kiyopon,
        R.drawable.tokuchi,
        R.drawable.togo,
        R.drawable.kintarou,
        R.drawable.reigen,
    )

    val listData: ArrayList<Chara>
        get() {
            val list = arrayListOf<Chara>()
            for (position in charaNames.indices) {
                val chara = Chara()
                chara.name = charaNames[position]
                chara.anime = charaAnime[position]
                chara.detail = charaDetails[position]
                chara.photo = charasImages[position]
                list.add(chara)
            }
            return list
        }
}
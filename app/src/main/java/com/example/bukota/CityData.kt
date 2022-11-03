package com.example.bukota

object CityData {
    private val cityNames = arrayOf("Banda Aceh",
        "Ambon",
        "Bandung",
        "DKI Jakarta",
        "DI Yogyakarta",
        "Lampung",
        "Makassar",
        "Manado",
        "Semarang",
        "Surabaya")

    private val cityDetail = arrayOf("Aceh adalah sebuah provinsi di Indonesia yang ibu kotanya berada di Banda Aceh.",
        "Kota Ambon atau Ambong dalam bahasa setempat adalah ibu kota dan kota terbesar dari Provinsi Maluku.",
        "Kota Bandung adalah ibu kota Provinsi Jawa Barat dan merupakan kota terbesar ketiga di Indonesia setelah Jakarta dan Surabaya.",
        "Jakarta, atau secara resmi bernama Daerah Khusus Ibukota Jakarta atau Jakarta Raya adalah ibu kota negara dan kota terbesar di Indonesia.",
        "Kota Yogyakarta atau dikenal oleh masyarakat setempat dengan nama Kota Jogja atau Kota Yogya adalah ibu kota dan pusat pemerintahan provinsi Daerah Istimewa Yogyakarta, Indonesia.",
        "Lampung adalah sebuah provinsi paling Selatan di pulau Sumatra, Indonesia dengan ibu kota atau pusat pemerintahan berada di Kota Bandar Lampung.",
        "Makassar adalah ibu kota provinsi Sulawesi Selatan, Indonesia.",
        "Kota Manado atau Menado adalah ibu kota dari provinsi Sulawesi Utara, Indonesia.",
        "Semarang adalah ibu kota Provinsi Jawa Tengah, Indonesia. Kota ini sekaligus menjadi Kota metropolitan terbesar kelima di Indonesia setelah Jakarta, Surabaya, Bandung, dan Medan.",
        "Kota Surabaya adalah ibu kota Provinsi Jawa Timur, Indonesia, yang menjadi pusat pemerintahan dari Provinsi Jawa Timur, sekaligus kota megapolitan terbesar di provinsi tersebut.")

    private val cityImages = intArrayOf(R.drawable.aceh,
        R.drawable.ambon,
        R.drawable.bandung,
        R.drawable.jakarta,
        R.drawable.jogja,
        R.drawable.lampung,
        R.drawable.makassar,
        R.drawable.manado,
        R.drawable.semarang,
        R.drawable.surabaya)

    private val cityInformation = arrayOf("5,372 juta",
        "368.987",
        "2,6 juta",
        "10,56 juta",
        "422.732",
        "8,458 juta",
        "1,508 juta",
        "432.300",
        "1,729 juta",
        "2,87 juta")

    val listData: ArrayList<City>
        get(){
            val list = arrayListOf<City>()
            for (position in cityNames.indices){
                val city = City()
                city.name = cityNames[position]
                city.detail = cityDetail[position]
                city.photo = cityImages[position]
                city.information = cityInformation[position]
                list.add(city)
            }
            return list
        }

}
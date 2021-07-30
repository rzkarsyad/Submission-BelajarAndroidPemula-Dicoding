package com.dicoding.ebooks

object BooksData {
    private val bookTitles = arrayOf(
        "From Dream to Habits",
        "Percakapan Praktis Bahasa Jerman untuk Traveller",
        "The Naked Traveler Anthology",
        "Value Investing: Beat The Market in Five Minutes!",
        "Daun Yang Jatuh Tak Pernah Membenci Angin - Cetak Ulang",
        "Jodoh Pasti Bertemu",
        "Cepat Belajar Hacking",
        "Passive Income dari Google AdSense",
        "PHP Komplet",
        "Mudah Membuat Aplikasi Android dengan Ionic 3"
    )

    private val bookDescs = arrayOf(
        "Jika Anda merasa kesuksesan terjadi karena kebetulan atau keberuntungan semata, Anda tidak perlu membaca buku ini. Buku From Dream to Habits ditulis untuk Anda yang ingin mewujudkan mimpi tanpa terhalang faktor-faktor luar, karena keberhasilan bergantung kepada kesiapan Anda sendiri. Tetapkan mimpi, buat rencana, laksanakan, dan jadikan kebiasaan, maka Anda akan mencapai mimpi demi mimpi, dari yang kecil hingga yang tertinggi. Go beyond your dream. Jika Anda sudah terbiasa mewujudkan mimpi, Anda akan terus maju, menaklukkan satu demi satu tantangan di dunia.",
        "Eropa merupakan benua terpopuler sebagai tujuan studi atau wisata para traveller. Hal utama yang harus dimiliki oleh seorang traveller adalah kemampuan dalam berbahasa. Bahasa Jerman adalah bahasa utama di negara-negara cakupan Eropa—di samping bahasa Inggris. Disebut bahasa utama, karena digunakan oleh penduduk yang tinggal di beberapa negara di Eropa, seperti Jerman, Swiss, Austria, Liechtenstein, Luxemburg, serta di negara-negara yang berbatasan langsung dengan Jerman. Buku ini dibuat untuk Anda pembelajar pemula yang ingin berbicara dalam bahasa Jerman dengan mandiri. Buku ini cocok bagi pembelajar pemula yang memiliki tujuan wisata ataupun sekadar menemui sanak keluarganya di negara Eropa tersebut. Kelebihan dari buku ini adalah pada bentuk percakapan yang tematik. Pada setiap tema akan dipaparkan kata yang berhubungan dengan tema tersebut dalam bahasa Indonesia secara alfabetis dan diterjemahakan ke dalam bahasa Jerman. Semoga buku ini dapat menjadi bagian terpenting hidup Anda, para traveller!",
        "Apa jadinya kalau traveler yang sudah menghabiskan ribuan jam di atas pesawat ternyata menyimpan ketakutan terhadap transportasi udara, seorang polisi yang menemukan bahwa tempat wisata favoritnya adalah lokasi populer untuk bunuh diri, atau traveler yang membayar mahal demi kenyamanan tapi terpaksa tertahan belasan jam di atas pikap pengangkut sapi? Setiap traveler pasti memiliki tantangannya tersendiri dalam menaklukan setiap medan. Jalan terjal yang harus dilalui memang tak pernah sama. Tapi mereka memiliki tekad yang serupa: harus sampai ke tempat tujuan. Pesan itulah yang ingin disampaikan oleh ke-15 traveler dalam buku ini. Latar belakang mereka yang begitu beragam, mulai dari wartawan, penulis novel, peneliti, hingga polisi membuat cerita-cerita yang dituturkan menjadi penuh warna.",
        "Warren Buffett, investor legendaris dan salah satu orang terkaya di dunia, dalam seminarnya di tahun 1984 di kampus Columbia Business School, Amerika Serikat, memaparkan tentang kinerja investasi dari tujuh investor saham penganut metode value investing, termasuk dirinya sendiri, yang kesemuanya sukses menghasilkan persentase keuntungan yang secara signifikan di atas rata-rata pasar. Menurut Buffett, ketujuh investor tersebut memiliki gaya investasinya masing-masing yang berbeda satu sama lain, termasuk pilihan sahamnya juga berbeda-beda. Tapi pertanyaannya kemudian, bagaimana kita tahu sebuah saham itu bagus atau jelek? Dan bagaimana caranya untuk menilai apakah harganya mahal, wajar, atau murah? Nah, di buku Value Investing: Beat the Market in Five Minutes! ini, kita akan menjawab semua pertanyaan tersebut secara lugas dan lengkap namun mudah untuk dipahami, berdasarkan pengalaman penulis sebagai value investor itu sendiri. Yup, jadi buku ini tidak sekadar memaparkan teori tentang value investing, melainkan juga contoh-contoh penerapannya dalam berinvestasi di saham. Fakta menariknya adalah, ketika nanti Anda sudah menguasai dan mampu mempraktikkan metode value investing ini dengan baik, maka anda hanya akan perlu bekerja kurang dari 5 menit saja setiap harinya, tapi hasil profi tnya tetap akan luar biasa!",
        "Dia bagai malaikat bagi keluarga kami. Merengkuh aku, adikku, dan Ibu dari kehidupan jalanan yang miskin dan nestapa. Memberikan makan, tempat berteduh, sekolah, dan janji masa depan yang lebih baik. Dia sungguh bagai malaikat bagi keluarga kami. Memberikan kasih sayang, perhatian, dan teladan tanpa mengharap budi sekali pun. Dan lihatlah, aku membalas itu semua dengan membiarkan mekar perasaan ini. Ibu benar, tak layak aku mencintai malaikat keluarga kami. Tak pantas. Maafkan aku, Ibu. Perasaan kagum, terpesona, atau entahlah itu muncul tak tertahankan bahkan sejak rambutku masih dikepang dua. Sekarang, ketika aku tahu dia boleh jadi tidak pernah menganggapku lebih dari seorang adik yang tidak tahu diri, biarlah... Biarlah aku luruh ke bumi seperti sehelai daun… daun yang tidak pernah membenci angin meski harus terenggutkan dari tangkai pohonnya.",
        "Bicara jodoh adalah bicara tentang hal yang jauh ke depan: bukan semata-mata baiknya fisik lantas bisa membuat Anda tertarik. Saya yakin setiap orang sudah tertulis jodohnya. Sejauh apa pun takdir dunia memisahkan, pasti ada cara Tuhan untuk bisa mempersatukan. Buku Jodoh Pasti Bertemu karya Arif Hidayat ini sangat mencerahkan. Ditulis dengan bahasa yang santun, namun sangat membangun. Begitu menginspirasi, tapi tidak menggurui.",
        "Peran teknologi semakin lama semakin berkembang pesat dari hari ke harinya. Jika Anda perhatikan, secara berkala, beberapa programmer hebat membuat aplikasi baru, membangun jaringan, menciptakan software terbaru hampir setiap hari. Keadaan ini membuat kita mau-tidak-mau harus memiliki pengetahuan yang tidak sedikit dengan dunia Internet. Baik itu untuk Software ataupun Hardware. Namun tahukan Anda, setiap aplikasi atau jaringan mempunyai celah untuk ditembus? Tidak ada sistem yang aman. Itu adalah semboyan yang ditanamkan untuk para hacker yang berkecimpung di dunia maya. Beberapa cara dapat dicoba untuk membobol sistem. Seperti binary pada Android, rooting pada cpanel website atau menanamkan shell ke dalamnya, menjadi mata-mata pada jaringan orang lain, mengubah sistem dasar Windows, membuat virus yang bisa merusak sistem sekalipun bisa Anda lakukan.",
        "Salah satu sumber pendapatan yang bisa kamu andalkan di internet adalah Google AdSense. Jika kamu ingin menghasilkan pendapatan sebagai pemilik web ataupun pemilik saluran Youtube, kamu bisa gunakan Google AdSense. Lantas, bagaimana cara dan langkah demi langkah menghasilkan pendapatan dari Google AdSense? Temukan jawaban dan panduan lengkapnya di buku ini. Inilah pembahasan menarik yang ada di buku ini: ● Pengenalan tentang Google AdSense. Mulai dari apa itu Google AdSense, bagaimana cara kerjanya, hingga hal-hal yang perlu disiapkan. ● Panduan lengkap membuat blog/web secara langkah demi langkah. Jika kamu belum punya web sekalipun, kamu akan dipandu mulai dari awal untuk membuat blog/web. ● Panduan dan cara mendaftar Google AdSense. ● Panduan dan cara menampilkan iklan Google AdSense di blog. ● Berbagai tools keren untuk membantumu menjadi blogger dan YouTuber. ● Panduan membuat saluran YouTube yang menarik dan bisa dimonetisasi dengan Google AdSense. Cara menampilkan iklan AdSense di saluran YouTube-mu. ● Panduan langkah demi langkah menjadi seorang YouTuber dan pemilik saluran YouTube. Selain itu, sebagai pembaca buku ini kamu juga akan mendapatkan belasan bonus video tutorial yang akan memandumu belajar seputar blog, YouTube, dan Google AdSense. Keunggulan buku ini adalah kamu tidak hanya dipandu untuk membuat web/blog, tetapi kamu juga dipandu membangun passive income melalui saluran YouTube. Jadi, kamu bisa sekaligus belajar menjadi blogger dan YouTuber.",
        "PHP merupakan pemrograman wajib bagi para web developer. Buku ini menjelaskan PHP sejak dari dasar hingga pemrograman web berbasis database. Buku ini menyediakan hampir sebagian besar teori yang Anda butuhkan untuk mengenal PHP dan segala kemampuannya. Dengan demikian, Anda bisa mengenali PHP secara cepat dan langsung mempraktikkannya untuk membuat aplikasi website.",
        "Sekarang ini membuat aplikasi Android tidak harus menguasai Java. Kita dapat dengan mudah membuat aplikasi Android dengan menggunakan bahasa pemrograman web, yaitu HTML, Javascript, dan CSS. Salah satu framework yang paling terkenal dan banyak digunakan untuk membuat aplikasi Android dengan bahasa pemrograman web adalah Ionic. Ionic berkolaborasi dengan Cordova sehingga memungkinkan aplikasi yang dibuat dapat mengakses fitur Native seperti kamera, kontak, geolocation, dan sebagainya. Pembahasan dalam buku ini dimulai dari dasar Typescript, Angular, dan Ionic. Selanjutnya dibahas berbagai komponen Ionic, setting Ionic untuk Android, hingga penggunaan native Ionic. Dibahas juga penyimpanan data pada Ionic termasuk integrasi Ionic dengan PHP dan MySQLi disertai dengan contoh operasi CRUD. Pada bagian akhir dibahas langkah demi langkah membuat aplikasi berbagi foto ala Instagram. Pembahasan selengkapnya mencakup: - Dasar-dasar Typescript - Dasar-dasar Angular - Dasar-dasar Ionic - Komponen Ionic - Setting Platform Android - Plugin Native Ionic - Integrasi Ionic dengan PHP dan MySQLi - Tips dan Trik Ionic - Membuat aplikasi berbagi foto ala Instagram."
    )

    private val bookWritters = arrayOf(
        "Hasanudin Abdurakhman",
        "Ifah Janifah",
        "Trinity",
        "Teguh Hidayat",
        "Tere Liye",
        "Arif Hidayat",
        "Adelphia. A",
        "Jefferly Helianthusonfri",
        "Jubilee Enterprise",
        "Rohi Abdulloh",
    )

    private val bookPages = arrayOf(
        "288",
        "184",
        "237",
        "258",
        "268",
        "180",
        "128",
        "248",
        "274",
        "258"
    )

    private val bookCategories = arrayOf(
        "Motivation & Self-Help",
        "Reference & Dictionary",
        "Travel",
        "Business & Investing",
        "Teen & Young Adult Fiction",
        "Religion & Spirituality",
        "Computers & Technology",
        "Computers & Technology",
        "Computers & Technology",
        "Computers & Technology"
    )

    private val bookPublishers = arrayOf(
        "Kepustakaan Populer Gramedia",
        "Bhuana Ilmu Populer",
        "MIZAN",
        "Elex Media Komputindo",
        "Gramedia Pustaka Utama",
        "Grasindo",
        "Elex Media Komputindo",
        "Elex Media Komputindo",
        "Elex Media Komputindo",
        "Elex Media Komputindo"
    )

    private val bookImages = intArrayOf(
        R.drawable.novel,
        R.drawable.jerman,
        R.drawable.traveler,
        R.drawable.value_investing,
        R.drawable.romantis,
        R.drawable.romantis_dua,
        R.drawable.hacking,
        R.drawable.adsense,
        R.drawable.php,
        R.drawable.iconic
    )

    val listData: ArrayList<Book>
    get(){
        val list = arrayListOf<Book>()
        for (position in bookTitles.indices){
            val book = Book()
            book.title = bookTitles[position]
            book.description = bookDescs[position]
            book.writter = bookWritters[position]
            book.pages = bookPages[position]
            book.category = bookCategories[position]
            book.publisher = bookPublishers[position]
            book.image = bookImages[position]
          list.add(book)
        }
        return list
    }
}
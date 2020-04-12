package com.example.informasikomiksijuki;

import java.util.ArrayList;

public class ComicData {
    private static String[] comicNames ={
            "Si Juki Cari Kerja",
            "Si Juki Bacotan Bola",
            "Si Juki Dan Petualangan Lulus Un",
            "Si Juki Dan Lika-Liku Anak Kosan",
            "Si Juki Vs Dompet Kosong",
            "Si Juki Keliling Nusantara",
            "Si Juki Dan Dunia Dongeng",
            "Si Juki Keroyokan Part1",
            "Si Juki Keroyokan Part2",
            "Si Juki Keroyokan Part7"


    };

    private static String[] comicDetail ={
        "Setelah lulus SMA, Juki-bocah nyentrik yang ngakunya anti mainstream - memutuskan untuk langsung bekerja. dengan keterampilan seadanya, kelakuan nyeleneh dan teman-teman yang ajaib, juki memulai petualangannya. sayang, ada hal yang juki tidak tahu, yaitu susahnya mencari pekerjaan tanpa bekal yang cukup. berbagai macam hal dicobanya, jadi buruh tempel sedot WC,.Petugas delivery servic sebuah warte, figuran acara televisi, sampai menjadi asisten dukun mbah gendeng, semuanya gagal total.",
         "Setelah lama cuit-cuit soal bola di twitter dan membuat beberapa tulisan di blog, akhirnya gue dipercaya penerbit buat ngebikin buku sepak bola, sob. Gue sudah macem komentatroe yang biasa-biasa aja dong, semua sisi bahasan gue pasti seru. Misal nih:\n" +
                 "\n" +
                 "Kenapa bola itu bundar\n" +
                 "Cara menjelaskan offside dengan mudah\n" +
                 "Bagaimana cara mendapatkan kartu merah yang baik dan benar\n" +
                 "Cara membangun karir dari penonton bola hingga menjadi juara takram\n" +
                 "Dijamin, kalian nggak bakal terlihat cupu lagi kalo nongktong dan ngobrolin soal sepak bola",
                 "Juki, seorang siswa SMA nyentrik yang mengaku “anti-mainstream” akan menghadapi UN.\n" +
                         "Karena malas dan menganggap belajar untuk lolos UN “terlalu mainstream“, maka Juki dan Boy—\n" +
                         "sahabat Juki yang merasa ganteng—berusaha mencari jalan lain. Mulai dari usaha mencuri soal UN,\n" +
                         "sampai datang ke dukun sakti Mbah Gendeng.\n" +
                         "\n" +
                         "Atas wangsit sang Dukun, mereka pun pergi mencari “empat koin sakti” yang konon dapat membuat\n" +
                         "mereka mendadak pintar. Masalahnya, keempat koin ini berada di tempat-tempat yang tidak lazim,\n" +
                         "dan ditunggu macam-macam mahkluk aneh.\n" +
                         "\n" +
                         "Berhasilkah mereka lulus UN dengan jalan yang “tidak mainstream” ini?\n" +
                         "Ikuti petualangan Juki!",
            "Juki, seorang siswa SMA nyentrik yang mengaku “anti-mainstream” akan menghadapi UN.\n" +
                    "Karena malas dan menganggap belajar untuk lolos UN “terlalu mainstream“, maka Juki dan Boy—\n" +
                    "sahabat Juki yang merasa ganteng—berusaha mencari jalan lain. Mulai dari usaha mencuri soal UN,\n" +
                    "sampai datang ke dukun sakti Mbah Gendeng.\n" +
                    "\n" +
                    "Atas wangsit sang Dukun, mereka pun pergi mencari “empat koin sakti” yang konon dapat membuat\n" +
                    "mereka mendadak pintar. Masalahnya, keempat koin ini berada di tempat-tempat yang tidak lazim,\n" +
                    "dan ditunggu macam-macam mahkluk aneh.\n" +
                    "\n" +
                    "Berhasilkah mereka lulus UN dengan jalan yang “tidak mainstream” ini?\n" +
                    "Ikuti petualangan Juki!",
            "Inilah komik yang direkomendasikan oleh perserikatan anak kos alam semesta untuk masyarakat dunia demi kemajuan teknologi peradaban umat manusia!",
            "Baca terus keseruan, kekocakan dan kekonyolan Si Juki kali ini adalah berbagai usaha Juki dalam mencari rezeki untuk ngisi dompet kosongnya.",
            "Di tengah waktu menganggurnya sebagai anak kos, Si Juki tiba-tiba kedatangan Mang Awung yang mengaku sebagai agen rahasia. Mang Awung mengajak Juki menunaikan misi menemukan harta karun Indonesia. Harta karun seperti apa yang akan mereka temukan di Labuan Baju - Flores? Ayo berpetualang bersama Si Juki di Seri Jalan-jalan Nusantara!",
            "Saat kecil mungkin kamu pernah mendengar dongeng seperti Putri Salju, Aladdin, hingga Timun Mas. Semua dongeng itu takkan lagi sama bila Juki yang menjadi pemeran utamanya.\n" +
                    "Juki, Juleha, dan Profesor Yololoyo terperangkap di dunia dongeng. Dunia dongeng yang damai menjadi kusut berantakan! Simak keseruan mereka di Kisah Kusut Dunia Dongeng.",
            "Si Juki seri Keroyokan #1 adalah serangan pertama dari Juki ce-es untuk menguasai rak toko buku Indonesia dan menjadi serial terlaris di dunia. Ikuti kisah Juki menjadi manajer tim futsal TARKAM, aksi Juleha di sekolahnya, serta cerita Congky bareng sobat-sobat gaibnya. Nggak mau ketinggalan, hadir juga karakter komik lain yang bikin…\n" +
                    "\n" +
                    "Si Juki seri Keroyokan #1 adalah serangan pertama dari Juki ce-es untuk menguasai rak toko buku Indonesia dan menjadi serial terlaris di dunia. Ikuti kisah Juki menjadi manajer tim futsal TARKAM, aksi Juleha di sekolahnya, serta cerita Congky bareng sobat-sobat gaibnya.\n" +
                    "\n" +
                    "Nggak mau ketinggalan, hadir juga karakter komik lain yang bikin capek kalo harus disebutin semua. Kamu lihat saja gambar di atas cek isinya.",
            "Setelah memulai invasi dengan Seri Keroyokan #1, Juki ce-es meneruskan ambisinya menguasai rak toko buku Indonesia dan menjadi serial terlaris di dunia. Si Juki yang ditunjuk jadi manajer tim futsal tarkam mulai sibuk merekrut pemain untuk timnya. Sementara itu Raisah yang anak baru juga mulai akrab dengan teman-temannya. Tidak mau…\n" +
                    "\n" +
                    "Setelah memulai invasi dengan Seri Keroyokan #1, Juki ce-es meneruskan ambisinya menguasai rak toko buku Indonesia dan menjadi serial terlaris di dunia. Si Juki yang ditunjuk jadi manajer tim futsal tarkam mulai sibuk merekrut pemain untuk timnya. Sementara itu Raisah yang anak baru juga mulai akrab dengan teman-temannya.\n" +
                    "\n" +
                    "Tidak mau kalah, karakter-karakter lain juga makin seru ceritanya.\n" +
                    "Si Juki Seri Keroyokan #2 pasti menggebrak dengan semangat baru!",
                    "Yang anda lihat adalah Si Juki Seri Keroyokan edisi ketujuh. Hebatkan bisa ada sebanyak itu. Kamu sudah punya semuanya? Kalo ada yang terlewat segeralah kompletkan; jangan kendor sedikitpun dan tertinggal dalam pergaulan. di edisi ini, Mang Awung selaku 'pensiunan' militer ikut mengamankan kerusuhan Juki dan kawan-kawan. Dukung terus aksi keroyokan…\n" +
                            "\n" +
                            "\n" +
                            "Yang anda lihat adalah Si Juki Seri Keroyokan edisi ketujuh. Hebatkan bisa ada sebanyak itu. Kamu sudah punya semuanya?\n" +
                            "Kalo ada yang terlewat segeralah kompletkan; jangan kendor sedikitpun dan tertinggal dalam pergaulan.\n" +
                            "di edisi ini, Mang Awung selaku 'pensiunan' militer ikut mengamankan kerusuhan Juki dan kawan-kawan.\n" +
                            "Dukung terus aksi keroyokan ini. Laksanakan, Grak!"
    };
    private static int[] comicImages = {
            R.drawable.juki,
            R.drawable.juk4,
            R.drawable.juki2,
            R.drawable.juki3,
            R.drawable.juki5,
            R.drawable.juki7,
            R.drawable.juki10,
            R.drawable.juki8,
            R.drawable.juki9,
            R.drawable.juki6
    };

    static ArrayList<Comic> getListData() {
        ArrayList<Comic> list = new ArrayList<>();
        for (int position = 0; position < comicNames.length; position++) {
            Comic comic = new Comic();
            comic.setName(comicNames[position]);
            comic.setDetail(comicDetail[position]);
            comic.setPhoto(comicImages[position]);

            list.add(comic);
        }
        return list;
    }
}

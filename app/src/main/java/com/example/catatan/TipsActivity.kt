package com.example.catatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tips.*

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)
        val data = createTips()
        recycler_tips.layoutManager = LinearLayoutManager(this)
        recycler_tips.setHasFixedSize(true)
        recycler_tips.adapter = TipsAdapter (data,{ onItem: Tips -> onItemClicked(onItem)})
    }

    private fun onItemClicked(onItem: Tips) {
        val showDetailActivityIntent = Intent(this, TipsIntent::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.img_tips)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.des)
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, onItem.web)
        startActivity(showDetailActivityIntent)
    }

    private fun createTips(): List<Tips> {
        val rvList = ArrayList<Tips>()
        rvList.add(
            Tips(
                R.drawable.satu,
                "Buang sampah pada tempatnya",
                "Sampah-sampah yang menumpuk dapat menjadi sarang penyakit. Hal ini dikarenakan virus dan bakteri-bakteri lainnya menyukai tempat-tempat yang sangat kotor dan bau untuk berkembang biak. Mereka akan memperbanyak diri mereka dan kemudian menyebar melalui udara. Virus dan bakteri inilah yang nantinya akan terhirup oleh manusia sehingga kita bisa terjangkit beberapa penyakit, seperti disentri, demam, dan lain-lain. Selain itu, sampah-sampah yang menumpuk itu akan menimbulkan bau yang tidak sedap sehingga mengundang lalat-lalat untuk hinggap. Kemudian, lalat tersebut akan hinggap di makanan kita. Akibatnya, makanan kita akan tercemar virus dan bakteri berbahaya. Apabila kita mengkonsumsinya, maka kita akan terkena penyakit seperti disentri, diare, gangguan pencernaan, dan masih banyak lagi. Oleh karena itu, buanglah sampah pada tempatnya agar tidak menjadi sarang bagi virus dan bakteri.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.dua,
                "Menggunakan peralatan yang tidak sekali pakai",
                "Utamakan pengurangan, untuk menghindari produksi sampah dari awal, dan berinvestasi pada sistem penggunaan kembali dan pengisian ulang dalam mendistribusikan produk-produk mereka. Mereka perlu punya target pengurangan yang jelas dan rencana langkah yang akan dilakukan. Masyarakat di seluruh dunia telah melakukan sesuatu dengan mendesak perusahaan menggunakan sistem berkelanjutan ini. Saatnya perusahaan mengikuti desakan masyarakat dan membuat solusi yang sesungguhnya: penggunaan kembali.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.tiga,
                "Memilah sampah sesuai jenisnya",
                "Pengelolaan sampah semakin hari menjadi semakin penting. Bagaimana tidak, setiap harinya rata-rata sampah yang diangkut ke TPA Bantar Gebang sekitar 7400 ton sampah tahun 2018 atau mengalami kenaikan sebesar 600 ton/hari jika dibandingkan tahun 2017. Sampah-sampah tersebut dapat menyebabkan penyakit, merusak ekosistem, bahkan turut mendatangkan bencana seperti banjir. Sebagai Smartcitizens, hal yang dapat kita lakukan adalah mengurangi dan mengelola sampah secara bijak.\n" +
                        "Salah satu langkah utama dalam pengelolaan sampah adalah sorting atau pemilahan. Sampah harus dipilah dan dibuang berdasarkan jenisnya agar pengelolaan sampah lebih mudah.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.empat,
                "Mendaur ulang barang bekas",
                "Daur ulang adalah sesuatu yang luar biasa yang bisa didapatkan dari sampah. Proses daur ulang aluminium dapat menghemat 95% energi dan mengurangi polusi udara sebanyak 95% jika dibandingkan dengan ekstraksi aluminium dari tambang hingga prosesnya di pabrik. Penghematan yang cukup besar pada energi juga didapat dengan mendaur ulang kertas, logam, kaca, dan plastik. Daur ulang lebih difokuskan kepada sampah yang tidak bisa didegradasi oleh alam secara alami demi pengurangan kerusakan lahan. Secara garis besar, daur ulang adalah proses pengumpulan sampah, penyortiran, pembersihan, dan pemprosesan material baru untuk proses produksi.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.lima,
                "Menanam kembali lahan gundul",
                "Sudah bukan rahasia lagi bila banyak hutan di Indonesia ini sudah rusak. Ada banyak penyebab kerusakan hutan seperti kebakaran, illegal logging, pertambangan, pembukaan lahan, dan sebagainya. Padahal hutan mempunyai peranan yang sangat penting untuk ekosistem. Kerusakan hutan bisa mengancam kelangsungan hidup satwa yang ada didalammya dan juga menjadi sumber bencana bagi manusia.\n" +
                        "\n" +
                        "Untuk menanggulangi kerusakan hutan, ada satu cara yang bisa dilakukan yaitu reboisasi. Reboisasi adalah penanaman kembali hutan atau lahan yang gundul dan mengembalikan fungsinya seperti semula.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.enam,
                "Hindari penggunaan plastik",
                "Plastik sangat berbahaya bagi kondisi bumi. Plastik yang dibuang menghasilkan emisi karbon yang dampaknya membuat bumi semakin memanas. Kantong plastik yang dibuang sembarangan dapat mencemari lingkungan seperti mengganggu ekosistem sungai dan laut.  \n" +
                        "\n" +
                        "Jika sampah-sampah tersebut dibakar, dapat mengganggu kesehatan pernapasan manusia dan udara sekitar. Ditambah lagi, sampah plastik terurai sangat lama karena rantai karbonnya sangat panjang. ",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.tujuh,
                "Menggunakan sepeda untuk transportasi",
                "Di era saat ini orang-orang lebih memilih kendaraan pribadi seperti mobil dan sepeda motor sebagai alat transportasi sehari-sehari. Baik untuk pergi ke kantor, kampus dan sekolah atau ketempat-tempat pembelajaan dan tempat lainnya. Akibatnya kondisi bumi kita semakin panas, sulit mencari area teduh, selain itu polusi udara juga semakin menyesakkan dada. Solusinya agar dapat mengurangi polusi udara adalah dengan cara bersepeda, dengan bersepeda dapat mengurangi 1200 ton polutan timbal pertahunnya yang berasal dari 5 juta knalpot pada kendaraan bermotor.\n" +
                        "\n" +
                        "Dengan bersepeda kita turut menjaga lingkungan agar terhindar dari polusi yang berbahaya bagi kesehatan tubuh manusia. Bayangkan saja jika semua orang tersadar akan bahayanya polusi bagi kesehatan, mungkin bersepeda merupakan solusi utama.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.delapan,
                "Mengolah limbah sebelum dibuang",
                "Setiap hari, limbah baru selalu ada, baik limbah rumah tangga maupun limbah industri. Kalau nggak diolah dengan benar, maka limbah dapat mencemari lingkungan dan sangat berbahaya. Nah kali ini, kita bakal bahas tentang pengolahan air limbah yang baik. Tujuan dari pengolahan ini adalah untuk menetralkan air dari bahanbahan tersuspensi dan terapung, menguraikan bahan organik biodegradable, meminimalkan bakteri patogen, serta memerhatikan estetika dan lingkungan.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.sembilan,
                "Membersihkan rumah dan lingkungan sekitar",
                "Menjaga kebersihan di sekitar rumah tinggal kedengarannya memang mudah dilakukan namun dalam penerapannya terkadang mengalami banyak kendala. Rumah merupakan tempat dimana kita menemukan kenyamanan, kedamaian, dan ketenangan di dalamnya. Nyaman atau tidaknya sebuah tempat tinggal terkadang ditentukan oleh faktor kebersihan. Pastikan bahwa rumah yang kita huni bersih dan bebas dari serangga dan hewan pengerat seperti tikus dan insecta.  Oleh sebab itu diperluan cara- cara efektif dalam menjaga kebersihan rumah tinggal Anda.",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )
        rvList.add(
            Tips(
                R.drawable.sepuluh,
                "Menggunakan peralatan ramah lingkungan",
                "Kelestarian lingkungan kini menjadi topik hangat yang kerap mengisi linimasa. Terlebih, penggunaan plastik turut berkontribusi dalam menciptakan kerusakan tersebut. Pada akhirnya kemajuan teknologi harus digunakan untuk menciptakan produk-produk ramah lingkungan, seperti daftar alat makan yang digunakan untuk bekal",
                "https://www.youtube.com/watch?v=JyL58vlbvgw"
            )
        )

        return rvList
    }
}
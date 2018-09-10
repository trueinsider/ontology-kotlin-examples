import com.github.ontio.OntSdk

fun main(args: Array<String>) {
    val ontSdk = OntSdk.getInstance()
    ontSdk.setConnectMainNet()
    println(ontSdk.connect.blockHeight)
}
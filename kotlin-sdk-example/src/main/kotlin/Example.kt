import com.github.ontio.OntSdk

fun main(args: Array<String>) {
    OntSdk.setConnectMainNet()
    println(OntSdk.connect.getBlockHeight())
}
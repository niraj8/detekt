object Versions {

    const val DETEKT: String = "1.10.0-RC1"
    const val JVM_TARGET: String = "1.8"
    const val JACOCO: String = "0.8.5"

    fun currentOrSnapshot(): String {
        if (System.getProperty("snapshot")?.toBoolean() == true) {
            return "$DETEKT-SNAPSHOT"
        }
        return DETEKT
    }
}

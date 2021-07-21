object Releases {
    private const val versionMajor = 1
    private const val versionMinor = 0
    private const val versionPatch = 0

    val appVersionName =
        String.format("%d.%d.%d", versionMajor, versionMinor, versionPatch)

    val appVersionCode =
        (versionMajor * 1000000) + (versionMinor * 100000) + (versionPatch * 10000) + Integer.valueOf(System.getenv("BUILD_NUMBER") ?: "0")

}

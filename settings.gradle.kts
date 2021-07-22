rootProject.name = "TodoLar"
include(
    ":app",
    ":common:localstorage"
)

//library module
include(
    ":library:functional",
    ":library:datasource",
    ":library:mapper"
)
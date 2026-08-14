cmake_minimum_required(VERSION 3.10)
project(aos_hook)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_library(aos_hook SHARED
    jni/aos_hook.cpp
    jni/net_client.cpp
)

target_include_directories(aos_hook PRIVATE jni)

target_link_libraries(aos_hook
    log
    dl
)

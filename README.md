# goodGitRepo
我喜欢且常用的 Github 好 Repository （我觉得的(多数都是Android方面的)）

## [Rxhttp](https://github.com/liujingxing/rxhttp)
网络请求库，基于OKHttp，支持 kotlin 协程，RxJava2、RxJava3，简单易用


## [XXPermission](https://github.com/getActivity/XXPermissions)
权限请求框架


## [BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)
RecyclerView 的 Adapter 帮助类，配合 kotlin RecyclerView 扩展，以后编写RecyclerView就不用再写 Adapter 了

RecyclerView 扩展类可参考本库内的 RecyclerExt.kt 文件

使用方法为： 

```
customViewRv!!
            .layout()
            .bindData(dataList, R.layout.item_home_btn) { holder, t ->
                holder.setText(R.id.btn, t)
            }.onItemChildClick(R.id.btn) { _, _, position ->
                when (position) {
                    0 -> startActivity(Intent(this, ScrollNumberActivity::class.java))
                    1 -> startActivity(Intent(this, MultipleViewTestActivity::class.java))
                    2 -> startActivity(Intent(this, ObjectAnimatorTestActivity::class.java))
                    3 -> startActivity(Intent(this, FontResizeActivity::class.java))
                }
            }.onItemClick { _, _, position ->
                ToastUtil.show("You clicked item $position")
            }
```


## [AndroidKTX](https://github.com/li-xiaojun/AndroidKTX)
kotlin 扩展类，封装了许多常用且好用的 kotlin 扩展


## [Android CN_OAID](https://github.com/gzu-liyujiang/Android_CN_OAID)
Android 唯一设备标识解决方案


## [XBanner](https://github.com/xiaohaibin/XBanner)
图片轮播


## [BasePopup](https://github.com/razerdp/BasePopup)
便捷的 Popup window 弹窗库


## [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout)
上拉刷新，下拉加载刷新库


## [XUI](https://github.com/xuexiangjys/XUI)
Android 原生 UI 框架


## [ImmersionBar](https://github.com/gyf-dev/ImmersionBar)
android 4.4以上沉浸式状态栏和沉浸式导航栏管理


## [AgentWeb](https://github.com/Justson/AgentWeb)
基于 Android Webview 的 Webview 加载库


## [PictureSelector](https://github.com/LuckSiege/PictureSelector)
图片选择器，功能强大，简单易用，还可选择其它媒体文件


P.s. 一些常用且知名度颇高的就不再提了，比如EventBus, Glide, Butterknife 之类的
持续更新。。。。

# BackendAPIs
对后台接口的重置版 原接口：https://github.com/hongye-L/SportAPPsOfBackend

去掉了一些不必要的代码，并且对一些重复的接口进行合并

整合spring+springmvc+mybatis
（目前基本完成）


:exclamation:数据库结构的变化和须知：

:one:帖子，评论，回复的用户有关字段只留下了UID 用户昵称和头像字段删除

2️⃣:所有数据库的UID字段都不建议输入字符 会导致点赞功能出错 

:clipboard:未来的一些更新目标或者设想：
:soon::soon::soon::soon::soon::soon::soon:

:one:.计划整合Redis 为将来缓存机制做好准备（比如说登录和权限组管理）

2️⃣ 计划用Redis实现二级缓存 优化数据库读取效率
![QQ图片20220125155519](https://user-images.githubusercontent.com/74951837/150934949-8649c155-7c4f-418f-8f08-a8dff34614fa.jpg)

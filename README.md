# MyBlog
个人博客项目，主要采用Vue2+SpringBoot前后端分离开发

## 关于

<p>
作者:胡猛
<br>
项目地址:
<br>
gitee: <a href=" https://gitee.com/xiaohugitee/redBlog" > https://gitee.com/xiaohugitee/redBlog</a>
<br>
github:<a href=" https://www.github.com/redyouzi/redBlog" > https://www.github.com/redyouzi/redBlog</a>
</p>

一位普通的大学生,热爱web开发,在有学习一年的基础上,利用空余时间开发出的一个个人博客。 (自己写着玩的一个小项目 存在很多不足之处)
本项目是一个基于 **SpringBoot** 和 **Vue**和**BootStrap**响应式页面的前后端分离的项目,并且使用了一些 设计模式
(属于技术学习性的项目)

###### **特别鸣谢**

- Vue
- SpringBoot



## 项目结构和启动说明

### 目录结构

```
[Dec  9 13:13]  .
├── [Sep  6 20:42]  LICENSE-------------------------------------------项目开源说明
├── [Dec  9 13:13]  README.md-----------------------------------------项目说明文件


├── [Sep 17 16:06]  admin_page_plus-----------------------------------后台的vue项目
│   ├── [Sep 17 16:06]  README.md
│   ├── [Sep 17 16:06]  babel.config.js
│   ├── [Sep 17 16:06]  jsconfig.json
│   ├── [Sep 24 09:44]  package-lock.json
│   ├── [Sep 24 09:43]  package.json
│   ├── [Sep 27 21:48]  public
│   │   ├── [Sep 17 16:06]  favicon.ico
│   │   ├── [Sep 27 21:48]  image
│   │   │   ├── [Sep 19 19:00]  room.jpg
│   │   │   ├── [Sep 19 19:00]  wallhaven-9mjoy1_2560x1600.png
│   │   │   ├── [Sep 19 19:00]  wallhaven-k7v9yq.png
│   │   │   └── [Sep 19 19:00]  wallhaven-rdl9vw.jpeg
│   │   ├── [Sep 27 21:48]  images
│   │   │   └── [Sep 27 21:47]  avatar.png
│   │   └── [Sep 17 16:06]  index.html
│   ├── [Sep 20 22:11]  src
│   │   ├── [Sep 24 09:47]  App.vue
│   │   ├── [Sep 20 22:15]  api----------------------------------------统一api接口
│   │   │   ├── [Sep 27 21:42]  index.js
│   │   │   └── [Sep 24 09:46]  requests.js
│   │   ├── [Sep 17 16:06]  assets
│   │   │   └── [Sep 17 16:06]  logo.png
│   │   ├── [Sep 19 22:29]  components---------------------------------通用组件
│   │   │   └── [Dec  9 11:38]  Left.vue
│   │   ├── [Sep 19 22:33]  image
│   │   │   ├── [Sep 19 22:33]  avatar.png
│   │   │   ├── [Sep 19 14:50]  room.jpg
│   │   │   ├── [Sep 19 14:50]  wallhaven-9mjoy1_2560x1600.png
│   │   │   ├── [Sep 19 14:50]  wallhaven-k7v9yq.png
│   │   │   └── [Sep 19 14:50]  wallhaven-rdl9vw.jpeg
│   │   ├── [Sep 20 16:56]  main.js
│   │   ├── [Sep 24 09:41]  pages---------------------------------------路由页面
│   │   │   ├── [Sep 20 17:45]  BlogAdmin
│   │   │   │   └── [Sep 21 09:57]  index.vue
│   │   │   ├── [Sep 19 12:33]  Home
│   │   │   │   └── [Dec  9 11:36]  index.vue
│   │   │   ├── [Sep 19 12:31]  Login
│   │   │   │   └── [Dec  9 11:35]  index.vue
│   │   │   └── [Sep 24 09:41]  Me
│   │   │       └── [Sep 29 21:50]  index.vue
│   │   └── [Sep 19 12:35]  router--------------------------------------路由配置
│   │       └── [Sep 24 09:42]  index.js
│   └── [Sep 22 20:05]  vue.config.js------------------------------------vue配置文件


├── [Sep  8 16:12]  blog_page_plus-------------------------------------前台vue项目
│   ├── [Sep  8 13:24]  README.md
│   ├── [Sep  8 13:24]  babel.config.js
│   ├── [Sep  8 13:24]  jsconfig.json
│   ├── [Sep 15 21:55]  package-lock.json
│   ├── [Sep 15 21:55]  package.json
│   ├── [Sep 10 14:49]  public---------------------------------------静态资源文件
│   │   ├── [Sep 15 22:03]  css
│   │   │   └── [Sep  8 16:16]  materialdesignicons.min.css
│   │   ├── [Sep 10 14:49]  favicon.ico
│   │   ├── [Sep  8 16:21]  fonts
│   │   │   ├── [Sep  8 16:21]  materialdesignicons-webfont.eot
│   │   │   ├── [Sep  8 16:21]  materialdesignicons-webfont.ttf
│   │   │   ├── [Sep  8 16:21]  materialdesignicons-webfont.woff
│   │   │   └── [Sep  8 16:21]  materialdesignicons-webfont.woff2
│   │   ├── [Sep  9 16:32]  images
│   │   │   ├── [Sep  9 16:32]  author.jpg
│   │   │   ├── [Sep  9 16:32]  avatar.png
│   │   │   ├── [Sep  9 16:32]  blog
│   │   │   │   ├── [Sep  9 16:32]  post-1.png
│   │   │   │   └── [Sep  9 16:32]  post-2.jpg
│   │   │   └── [Sep  9 16:32]  left-bg.jpg
│   │   ├── [Sep 15 22:04]  index.html
│   │   └── [Sep 15 22:04]  js
│   ├── [Sep 15 22:05]  src----------------------------------------项目源文件
│   │   ├── [Sep 10 14:51]  App.vue
│   │   ├── [Sep  9 10:38]  api-------------------------------------统一api接口
│   │   │   ├── [Sep 13 20:09]  index.js
│   │   │   └── [Sep 11 13:21]  pageRequestBase.js
│   │   ├── [Sep  9 16:15]  assets
│   │   │   ├── [Sep  9 16:15]  img
│   │   │   └── [Sep  8 13:24]  logo.png
│   │   ├── [Sep  8 16:15]  components-------------------------------组件文件夹
│   │   │   └── [Sep  8 16:15]  Header
│   │   │       └── [Dec  9 12:46]  Header.vue
│   │   ├── [Sep  8 17:47]  images
│   │   │   ├── [Sep  8 16:15]  author.jpg
│   │   │   ├── [Sep  8 16:37]  avatar.png
│   │   │   ├── [Sep  8 16:15]  blog
│   │   │   │   ├── [Sep  8 16:15]  post-1.png
│   │   │   │   └── [Sep  8 16:15]  post-2.jpg
│   │   │   └── [Sep  8 16:15]  left-bg.jpg
│   │   ├── [Sep 15 22:05]  main.js
│   │   ├── [Sep  8 21:27]  pages----------------------------------路由页面
│   │   │   ├── [Sep  8 16:20]  About
│   │   │   │   └── [Dec  9 12:57]  index.vue
│   │   │   ├── [Sep  8 16:46]  Blog
│   │   │   │   └── [Dec  9 12:39]  index.vue
│   │   │   ├── [Sep  8 16:19]  Home
│   │   │   │   └── [Dec  9 11:33]  index.vue
│   │   │   └── [Sep  8 21:27]  Skill
│   │   │       └── [Sep 13 20:54]  index.vue
│   │   ├── [Sep  8 16:42]  router--------------------------------路由配置
│   │   │   └── [Sep 12 14:34]  index.js
│   │   └── [Sep  9 11:17]  store---------------------------------vueX数据统一管理仓库
│   │       ├── [Sep  9 11:17]  adminPage
│   │       │   └── [Sep  9 11:22]  index.js
│   │       ├── [Sep  9 11:17]  blogPage
│   │       │   └── [Sep 13 20:12]  index.js
│   │       └── [Sep  9 11:23]  index.js
│   └── [Sep  9 10:54]  vue.config.js------------------------------------vue配置文件


├── [Sep 17 16:06]  blog_web------------------------------------SpringBoot后台项目
│   ├── [Sep 13 19:58]  blog_web.iml
│   ├── [Sep  7 08:47]  pom.xml----------------------------------maven的pom文件
│   ├── [Sep 17 16:06]  src--------------------------------------项目源文件
│   │   ├── [Sep  6 20:48]  main---------------------------------main文件夹
│   │   │   ├── [Sep  7 09:02]  java
│   │   │   │   └── [Sep  6 20:48]  com
│   │   │   │       └── [Sep 13 12:52]  red
│   │   │   │           ├── [Sep  6 20:48]  BlogWebApplication.java--------SpringBoot的启动类
│   │   │   │           ├── [Sep 25 10:06]  common----------------------通用工具包
│   │   │   │           │   ├── [Sep  9 16:54]  JacksonObjectMapper.java-----------重新规定jackson序列化规则 主要是把雪花算法生成的Long类型id转为字符串类型 防止js精度失真
│   │   │   │           │   ├── [Sep 25 10:06]  PasswordEncoder.java------------加密密码(MD5单向加密)
│   │   │   │           │   ├── [Sep 22 19:26]  RedisConstant.java--------------Redis常量
│   │   │   │           │   └── [Sep 22 23:52]  ThreadLocals.java-------------用于获取当前线程存储的用户信息
│   │   │   │           ├── [Sep 25 10:19]  config-------------------------------配置包
│   │   │   │           │   ├── [Sep 23 00:03]  LoginInterceptor.java-----------登陆拦截器
│   │   │   │           │   ├── [Sep 10 13:29]  MyBatisPlusConfig.java----------MyBatisPlus配置类
│   │   │   │           │   └── [Sep 25 10:19]  WebMvcConfig.java---------------WebMvc配置 (对象转换器，拦截器)
│   │   │   │           ├── [Sep 25 10:05]  controller--------------------------controller控制层
│   │   │   │           │   ├── [Sep 22 23:38]  AdminBlogController.java
│   │   │   │           │   ├── [Sep 25 09:58]  AdminUserController.java
│   │   │   │           │   ├── [Sep 22 19:17]  BlogController.java
│   │   │   │           │   ├── [Sep 25 10:05]  LoginController.java
│   │   │   │           │   ├── [Sep 13 20:01]  SkillController.java
│   │   │   │           │   ├── [Sep 22 19:16]  UserController.java
│   │   │   │           │   └── [Sep  7 09:09]  utils--------------------------统一结果返回类型
│   │   │   │           │       └── [Sep  7 09:09]  Result.java
│   │   │   │           ├── [Sep 25 10:01]  dto--------------------------------DataToObject获取前端请求传递的数据
│   │   │   │           │   ├── [Sep 25 10:01]  AdminUserDTO.java
│   │   │   │           │   ├── [Sep 22 23:42]  BlogDTO.java
│   │   │   │           │   ├── [Sep 22 20:06]  UserDTO.java
│   │   │   │           │   └── [Sep 13 13:35]  UserSkillDTO.java
│   │   │   │           ├── [Sep 27 21:57]  entity-------------------------实体类
│   │   │   │           │   ├── [Sep 16 09:31]  Blog.java
│   │   │   │           │   ├── [Sep 12 10:01]  Skill.java
│   │   │   │           │   ├── [Sep 27 21:57]  User.java
│   │   │   │           │   └── [Sep 12 10:03]  UserSkill.java
│   │   │   │           ├── [Sep 10 14:36]  handler
│   │   │   │           │   ├── [Sep 10 14:31]  ExceptionHandler.java-----拦截所有异常,之后进行业务异常的细粒度控制
│   │   │   │           │   └── [Sep 10 14:36]  MyMetaObjectHandler.java---使用MP自动填充数据库字段创建时间和更新时间
│   │   │   │           ├── [Sep 12 10:28]  mapper----mapper接口包继承MyBatisPlus的BaseMapper类自动实现基本的数据操作
│   │   │   │           │   ├── [Sep  9 15:23]  BlogMapper.java
│   │   │   │           │   ├── [Sep 12 10:04]  SkillMapper.java
│   │   │   │           │   ├── [Sep 10 13:36]  UserMapper.java
│   │   │   │           │   └── [Sep 12 10:28]  UserSkillMapper.java
│   │   │   │           └── [Sep 25 09:55]  service--------------业务层接口
│   │   │   │               ├── [Sep 22 23:38]  BlogService.java
│   │   │   │               ├── [Sep 13 13:00]  SkillService.java
│   │   │   │               ├── [Sep 25 09:55]  UserService.java
│   │   │   │               ├── [Sep 12 10:18]  UserSkillService.java
│   │   │   │               └── [Dec  9 11:16]  impl-------------业务层接口实现类
│   │   │   │                   ├── [Sep 22 23:47]  BlogServiceImpl.java
│   │   │   │                   ├── [Sep 13 13:35]  SkillServiceImpl.java
│   │   │   │                   ├── [Dec  9 11:16]  UserServiceImpl.java
│   │   │   │                   └── [Sep 12 10:19]  UserSkillServiceImpl.java
│   │   │   └── [Sep 15 22:25]  resources--------------资源包
│   │   │       ├── [Sep 15 22:25]  application.yml----------SpringBoot配置文件 注意修改数据库的用户密码信息
│   │   │       ├── [Sep 12 11:30]  mapper---------------mapper接口的xml文件
│   │   │       │   ├── [Sep  9 15:23]  BlogMapper.xml
│   │   │       │   ├── [Sep 12 10:05]  SkillMapper.xml
│   │   │       │   ├── [Sep 10 13:42]  UserMapper.xml
│   │   │       │   └── [Sep 12 11:30]  UserSkillMapper.xml
│   │   │       ├── [Sep  6 20:48]  static
│   │   │       └── [Sep  6 20:48]  templates
│   │   └── [Sep  6 20:48]  test---------------测试包
│   │       └── [Sep  6 20:48]  java
│   │           └── [Sep  6 20:48]  com
│   │               └── [Sep 16 09:48]  red
│   │                   └── [Sep 16 09:48]  BlogWebApplicationTests.java
│   └── [Sep 17 16:06]  target----------------打包生成的目标文件
│       ├── [Dec  9 11:10]  classes
└── [Dec  9 12:51]  my_blog.sql---------------可执行sql文件

85 directories, 157 files
```

### 项目启动说明

1. 通过git命令克隆项目 ` git clone https://gitee.com/xiaohugitee/redBlog.git`
2. 创建名称为my_blog的数据库并在当前库中执行文件夹中的my_blog.sql的SQL脚本，创建数据库
3. 使用vscode打开blog_page_plus文件夹，打开终端并在当前文件夹下执行`npm i`命令，下载项目依赖库
4. 使用IDEA打开blog_web文件夹，并刷新maven下载maven依赖，同时修改SpringBoot配置文件中的mysql数据库连接信息
5. 运行SpringBoot的启动类，运行后端项目
6. 前端目录下在终端下执行`npm run serve`启动前端项目(前端的vue配置文件中已配置跨域请求)



## 前端页面

- PC首页

	![image-20221209125448723](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202212091254549.png)
	
	移动端
	
	<img src="https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202212091258254.png" alt="image-20221209125855211" style="zoom:50%; float:left" />
	
- 技术栈页面

	![image-20220924101803047](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202209241018111.png)
	
	<img src="https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202212091259152.png" alt="image-20221209125941097" style="zoom:50%;float:left" />
	
- 关于我页面

  ![image-20221209125642037](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202212091256127.png)
  
  <img src="https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202212091300126.png" alt="image-20221209130007089" style="zoom:50%;float:left" />



---


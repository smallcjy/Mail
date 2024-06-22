<p align="center">
<img alt="云信Mail" src="https://github.com/val213/Mail-frontend/blob/main/src/assets/logo.png?raw=true">
<br>
云信，更便捷的邮箱系统
<br><br>
</p>

# 云信Mail
Hi~ 这里是华南理工大学软件开发实训作品：邮件系统——**云信邮件系统**。**云信Mail**提供了全面、便捷的功能和简洁、美观的用户界面，用户可以方便地查看邮件、发送邮件、管理邮件。云信Mail支持注册邮箱、接收邮件、发送邮件、标记已读/未读邮件、删除邮件、星标邮件、草稿箱、新邮件到达通知、搜索、过滤邮件等功能，用户可以在云信Mail上高效地处理邮件。更多内容请查阅**项目Feature**。

## 技术栈
前端使用 `Vue3 + vue-cli` 框架和 `element-plus` 组件库 ，后端使用 `Springboot` 框架，数据库使用 `MySQL` 远程数据库和 `mybaits` ， 云服务器和短信服务都使用 `阿里云` 的产品，AI服务使用 `智谱清言` 的接口。
## 贡献者（6）
### 后端代码贡献者(4)
<a href="https://github.com/val213/Mail/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=val213/Mail" />
</a>

### 前端代码贡献者（2+3）
<a href="https://github.com/val213/Mail-frontend/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=val213/Mail-frontend" />
</a>

## 项目Feature
- **邮箱注册**：云信Mail提供注册功能，用户可以用手机号注册邮箱，经过短信验证码验证，获得专属邮箱地址后缀 `"@yunxin.com"` 。服务器保存用户信息到数据库中，用于用户登录邮箱时验证。
- **接收邮件**：一旦用户登录了电子邮件账户，云信Mail基于HTTP协议，可以自动连接到邮件服务器并下载新邮件，一旦新邮件被下载，用户可以在收件箱中查看。
- **发送邮件**：通过HTTP协议与邮件服务器进行通信以发送邮件，用户需要在表单中提供收件人地址、抄送、主题、邮件内容、上传的附件（可选）。
- **AI支持**：目前用户可以在阅读邮件的时候让AI自动总结邮件内容，方便用户快速了解邮件内容。
- **标记已读/未读邮件**：用户可以标记邮件为已读或未读，该状态会同步到服务器，在用户下次登录或者在其他设备登录时保持一致。
- **删除邮件**：用户可以选中批量删除邮件，将邮件移动到垃圾箱，可以进一步删除垃圾箱中的邮件，邮件会被永久删除。
- **星标邮件**：用户可以将重要的邮件标记为星标邮件，方便查找。
- **草稿箱**：用户可以保存未发送的邮件到草稿箱，下次登录时可以继续编辑。同样是存储在了后端，保证用户在不同设备上登录时草稿箱内容一致。
- **新邮件到达通知**：当用户收到新邮件时，云信Mail会弹出通知，提醒用户查看新邮件，并更新邮件列表。
- **支持搜索、过滤邮件**：用户可以通过关键字搜索邮件，也可以通过发件人、收件人、主题、时间等条件过滤邮件。
- **客户端和服务端邮件同步**：用户在不同设备上登录时，邮件状态、邮件内容、附件等信息都会同步到用户的设备上。
- **用户友好的UI界面**：云信Mail提供了简洁、美观的用户界面，用户可以方便地查看邮件、发送邮件、管理邮件。
- **对RESTFUL接口响应的成功/错误弹窗**：用户在操作时，会有相应的提示，方便用户了解操作结果，提升用户体验。例如成功或者失败(验证失败、操作不合法等)
- **服务端使用数据库对邮件进行存储**：邮件的元数据和正文，包括附件的元数据，都会存储在数据库中，保证数据的安全性和一致性。
- 使用MIME发送附件，收件人能下载对应邮件中的附件
- **客户端本地缓存**：断网时，用户的操作会被缓存，网络恢复后会自动执行
- **合理的报文约定**：前后端交互的报文格式合理，包括请求报文和响应报文，保证数据的完整性和一致性
- **服务端数据库设计合理**：根据E-R图设计数据库，将数据放在多个表中，保证数据的一致性和完整性

## 项目设计
### 项目架构图
![架构图](https://github.com/val213/Mail-frontend/blob/main/src/assets/Architecture.png)
### 设计原型图
![原型图](https://github.com/val213/Mail-frontend/blob/main/src/assets/%E5%8E%9F%E5%9E%8B%E5%9B%BE.png?raw=true)
## 后续可拓展功能
- **邮件分类**：用户可以将邮件分类，例如工作、学习、生活等，方便用户查找邮件。
- **邮件标签**：用户可以给邮件打标签，例如重要、紧急、待办等，方便用户查找邮件。
- **邮件过滤规则**：用户可以设置邮件过滤规则，例如将某个发件人的邮件自动归类到某个文件夹。
- **邮件定时发送**：用户可以设置邮件定时发送，例如设置明天早上8点发送邮件。
- **邮件加密**：用户可以对邮件进行加密，只有指定的接收者才能解密查看邮件。
- **邮件签名**：用户可以设置邮件签名，例如姓名、职务、公司等信息。
- **邮件模板**：用户可以设置邮件模板，例如常用的请假、报销、感谢等邮件模板。
- **邮件统计**：用户可以查看邮件统计数据，例如收发邮件数量、邮件时长、邮件分类等。
- **邮件备份**：用户可以备份邮件到本地或者云端，保证邮件数据的安全性。
- **邮件回复**：用户可以回复邮件，可以选择是否附带原邮件内容。
## 🚀 快速开始

### **安装项目依赖**
在本地部署本项目，需要分别安装服务端和客户端的依赖，分别进入 `backend` 和 `frontend` 目录，使用 `npm` 或者 `yarn` 执行依赖自动安装命令：
> 项目前后端分离，在Mail仓库下的frontend是作为子模块存在，实际上指向的是Mail-frontend仓库。你也可以到 [Mail-frontend](https://github.com/val213/Mail-frontend) 获取单独的前端代码。
```bash
cd Mail/[backend/frontend]
npm install
```
或者
```bash
cd Mail/[backend/frontend]
yarn install
```

### **启动云信Mail**

在本地部署或者开发本项目，需要分别启动服务端和客户端，分别进入 `backend` 和 `frontend` 目录，执行启动命令：
```bash
cd Mail/[backend/frontend]
npm run serve
```
### 打包部署
```bash
cd Mail/[backend/frontend]
npm run build
```
将打包后的前端静态资源和后端文件部署到服务器上，推荐使用`pm2`启动后端服务。

## 功能接口
支持在线查看接口文档：[在线接口文档](https://apifox.com/apidoc/shared-3353933f-2e4e-446c-aaa0-99028a45b51b)

## 数据库设计
绘制并根据E-R图将数据放在多个表中
![E-R图](frontend\src\assets\E-R图.png)
服务器将邮件正文和附件进行分离存储(将邮件本体存储数据库中，附件存储在磁盘)

### user

|字段|类型|约束|说明|
|:---:|:---:|:---:|:---:|
|id|integer|primary key|用户id|
|username|varchar(255)|not null|用户名|
|password|varchar(255)|not null|密码|
|emailAddress|varchar(255)|not null|邮箱地址|
|telephone|varchar(255)|not null|电话号码|
|create_time|datetime|not null|创建时间|
|update_time|datetime|not null|更新时间|


### mail

|字段|类型|约束|说明|
|:---:|:---:|:---:|:---:|
|id|integer|primary key|邮件id|
|sender_id|integer|not null|发送者id|
|receiver_id|integer|not null|接收者id|
|owner_id|integer|not null|邮件所有者id|
|theme|varchar(255)|not null|邮件主题|
|content|text|not null|邮件内容|
|send_time|varchar(255)|not null|发送时间|
|star|integer|not null|星标|
|readis|integer|not null|已读|
|draft|integer|not null|草稿|
|junk|integer|not null|是否废弃|

### attachment

|字段|类型|约束|说明|
|:---:|:---:|:---:|:---:|
|id|integer|not null|邮件id|
|file_name|varchar(255)|not null|附件文件名|
|file_size|bigint|not null|文件大小|
|download——url|varchar(255)|not null|下载链接|
|create_time|datetime|not null|创建时间|


<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

<!-- code_chunk_output -->

- [一、HTML](#一-html)
- [二十、axios](#二十-axios)

<!-- /code_chunk_output -->

# 一、HTML
    1.标签
        (1)html标签： 包裹head标签和body标签
            <html>:开始标签
            </html>:结束标签
            {1}head标签：包裹title标签和meta标签
                <head></head>
                [1]title标签:网页标题
                    <title></title>
                [2]meta标签:设置编码方式
                    <meta charset="">
            {2}body标签:填写网页内容
                <body></body>
                [1]br标签:在body标签内的单标签，表示换行
                    <br/>
                [2]p标签:段落标签，自动换行(比br标签换行的空隙大)
                    <p></p>
                [3]img标签:图片标签
                    <img src="" alt="">
                        alt表示图片的提示文字
                [4]标题标签:
                    <!-- 1-6文字大小从大到小 -->
                    *1.h1标签：
                        <h1></h1>
                    *2.h2标签：
                        <h2></h2>
                    *3.h3标签：
                        <h3></h3>
                    *4.h4标签：
                        <h4></h4>
                    *5.h5标签：
                        <h5></h5>
                    *6.h6标签：
                        <h6></h6>
                [5]列表标签：
                    *1.有序列表：ol标签和li标签
                        <!-- 文字前面自动加上序号，默认数字序号，使用type属性修改序号的类型(A表示大写字母，a表示小写字母，I表示大写罗马数字，i表示小写罗马数字)，start表示序号从第几个开始 -->
                        <ol type="" start="">
                            <li>文字</li> 
                            <li>文字</li>
                            ...
                        </ol>
                    *2.无序列表：ul标签和li标签
                        <!-- 使用type属性修改序号的形状(disc为默认圆形，square为方块，circle为圆圈) -->
                        <ul type="" start="">
                            <li>文字</li> 
                            <li>文字</li>
                            ...
                        </ul>
                [6]<b></b>加粗标签
                [7]<i></i>斜体标签
                [8]<u></u>下划线标签
                [9]上标标签<sub></sub>和下标标签<sup></sup>
                [10]符号
                    *1.比较符号
                        小于:&lt;
                        大于:&gt;
                        小于等于:&le;
                        大于等于:&ge;
                    *2.注册商标 &reg;
                    *3.版权符号 &copy;
                [11]span标签：不换行块标签
                    <span></span>
                [12]div层标签，换行块标签
                    <!-- id:
                             -->
                    <div id="">
                [13]a标签-->超链接
                    <!-- 可以跳转到对应地址 -->
                    <!-- target:
                                _self:默认值可不写，在本窗口打开
                                _blank:打开一个新窗口
                                _parent:在父窗口打开
                                _top:在顶层窗口打开-->
                    <a href="" target=""></a>
                [14]table标签，表格标签
                    <!-- border:表格边框的粗细
                                -->
                    <!-- width:填写表格宽度 -->
                    <!-- cellspacing:单元格间距 -->
                    <!-- cellpadding:单元格填充==>文字和边框的距离 -->
                        tr行标签
                            <!-- align:表示文字位置
                                        center：居中
                                        left：居左
                                        right：居右
                                        -->
                            th表头列标签
                            td列标签
                                <!-- rowspan:填写数字表示跨几行合并 -->
                                <!-- colspan:填写数字表示跨几列合并-->
                    <table border="" cellspacing="" cellpadding="">
                        <tr align="">
                            <th></th>
                            <td rowspan=""></td>
                            <td></td>
                            ...
                            <td></td>
                        </tr>
                    </table>
                [15]hr直线标签
                    <hr/>
                [16]表单标签
                    from表单标签
                        <!-- action: 配合input标签的type="submit" 可以设置提交的动作 ,-->
                        <!-- method:表单的发送方式
                                    post
                                    get
                                    -->
                        input输入标签
                            <!-- type：设置输入的值的类型 
                                        text 文本类型
                                        password 密码类型
                                        radio 单选类型
                                            name值必须相同
                                            value 配合radio，让服务器识别的内容
                                            checked：表示默认选中
                                        checkbox 复选类型，可以同时选择多个
                                            name值建议相同
                                            value 配合radio，让服务器识别的内容
                                            checked：表示默认选中
                                        submit: 设置提交按钮
                                            value 设置按钮的文本内容
                                        reset: 设置重置按钮，恢复页面的默认状态
                                            value 设置按钮的文本内容
                                        button:
                                            value 设置按钮的文本内容
                                        -->
                            <!-- name：(必须指定name属性，否则文本框的内容不会发给服务器)
                                        nickName -->
                        select标签：选择文本框
                            option标签：选择的文本内容
                                <!-- value：
                                            设置了服务器接收的值
                                            -->
                                <!-- selected：表示默认选中 -->
                        textarea标签：多行文本框
                            <!--
                                row:行值
                                cols:列值 -->
                    <form action="" method="">
                        <input type="" name=""/>
                        <input type="radio" name="gender" value="male"/>男
                        <input type="radio" name="gender" value="female"/>女
                        <select name="">
                            <option></option>
                            <option></option>
                            <option></option>
                            ....
                        </select>
                        <textarea name=""></textarea>
                    </form>
            {3}frameset标签：框架标签
                <!-- rows: -->
                <!-- cols: -->
                <!-- frameborder:
                                 no ->取消边框-->
                [1]frame标签
                    <!-- src: -->
                <frameset rows="" cols="">
                    <frame src="">
                </frameset>
            {4}iframe标签：嵌入子页面的框架标签
    2.特点
        (1)解释型语言
# 二、CSS
    1.导入环境
        {1}内部样式表
            在html的head标签里写入style标签：<style type="text/css"></style>
        {2}嵌入式样式表 
            style属性声明在body标签内声明的标签里
        {3}外部样式表
            在html的head标签里写入link标签，在href里写入CSS文件的路径
            <link rel="stylesheet" href="">
    2.使用CSS
        在style标签里写入CSS语法
    3.CSS分类
        {1}最基本分类
            (1)标签样式表
                标签类型{}
            (2)类样式表
                <!-- 设置有class属性且class值与该样式相同的标签 -->
                .class值{}
            (3)id样式表
                <!-- 设置有id属性且id值与该样式相同的标签 -->
                #id值{}
        {2}组合样式
            基本分类随意组合
                Eg: 标签类型 .class值{}
        {3}声明位置上的分类
            (1)内部样式表:声明在style标签内
            (2)嵌入式样式表:style属性声明在body标签内声明的标签里
            (3)外部样式表:CSS样式声明在外部CSS文件里，在html里导入此CSS文件
    4.盒子模型
        [1]属性值
            {1}margin:盒子外边距
                两个值：上下、左右
                三个值：上、左右、下
                四个值：上、右、下、左
            {2}padding:盒子内边距
            {3}border:边框
            {4}position:
                (1)absolution:绝对定位
                (2)relative:相对定位
            {5}float:浮动，可以解除行元素独占一行的特点
        [2]
# 三、JavaScript
    1.客户端的一个脚本语言
    2.导入：
        在html的head标签里声明script标签
            (1)在标签内使用js
                <script language="javascript"></script>
            (2)引入外部js文件
                <script type="text/javascript" src="js文件的路径"></script>
    3.使用
        (1)声明变量
            var 变量名 = 值;
        (2)声明方法
            function 方法名(参数名){
                return 值;
            }
        (3)声明js对象
            [1]方式一：
                var 对象名 = new Object;
                对象名.属性名 = xxxx;
                对象名.方法名 = function(){}
            [2]方式二：
                var 对象名 = {
                    "属性名":"xxxx",
                    "方法名":function(){}
                };
    4.DOM技术
        (1)鼠标悬浮和离开
            在标签内声明onmouseover属性
                <tr onmouseover="函数名1" onmouseout="函数名2">
                    <td onclick="点击事件"></td>
                </tr>
            或在js文件或script标签内声明
                window.onload = function(){
                    <!-- 根据id获取标签 -->
                    var table = document.getElementById("");
                    <!-- 获取表格中所有的行 -->
                    var row = table.rows;
                    <!--  遍历行-->
                    for(var i = 1;i < rows.length-1;i++){
                        var tr = rows[i];
                        tr.onmouseover = 函数名1;
                        <!-- 获取此行所有单元格 -->
                        var cells = tr.cells;
                        <!-- 获取某一单元格 -->
                        var priceTD = cells[1]
                        <!-- 绑定点击事件，点击出现文本框 -->
                        priceTD.onclick=点击事件;
                        }
                        <!-- 绑定删除指定行事件 -->
                        var img = cells[4].firstChild;
                        if(img&&img.tagName=="IMG"){
                            img.onclick = deleteRow;
                        }
                }
                function 函数名1(){}
                function 函数名2(){}
                function 点击事件(){
                    <!-- 设置点击出现文本框编辑内容 -->
                    if(event&&event.srcElement&&event.srcElement.tagName=="TD"){
                        var priceTD = event.srcElement;
                        <!-- 使用priceTD.firstChild.nodeType==3判断获取的是否问TextNode。TextNode对应3，ElementNode对应的是1 -->
                        if(priceTD.firstChild&&priceTD.firstChild.nodeType==3){
                            <!-- 获取当前节点的内部文本 -->
                            var oldPrice = priceTD.innerText;
                            <!-- innerHTML设置当前节点的内部HTML -->
                            priceTD.innerHTML="<input type='text'/>";
                            <!-- 获取该节点第一个子节点 -->
                            var input = priceTD.firstChild;
                            <!-- 将该子节点的原值赋给input标签作为文本框默认值 -->
                            if(input.tagName=="INPUT"){
                                input.value = oldPrice;
                                <!-- 选中输入框中的文本 -->
                                input.select();
                                <!-- 绑定输入框失去焦点事件 -->
                                input.onblur = updatePrice;
                                <!-- 绑定限制键盘只能输指定范围内容的时间 -->
                                input.onkeydown = checkInput;
                            }
                        }
                    }
                }
                <!-- 输入框失去焦点改变价格 -->
                function updatePrice(){
                    if(event&&event.srcElement&&event.srcElement.tagName=="INPUT"){
                        var input = event.srcElement;
                        var newPrice = input.value;
                        <!-- input节点的父节点是td -->
                        var priceTD - input.parentElement;
                        priceTD.innerText = newPrice;
                    }
                }
                <!-- 删除指定行 -->
                function deleteRow(){
                    if(event&&event.srcElement&&event.srcElement.tagName=="IMG"){
                        <!-- confirm()方法弹出对话框，带确定和取消按钮，点击确定返回true，点击取消返回false -->
                        if(windows.confirm("是否确认删除当前行")){
                            var img = event.srcElement;
                            var tr = img.parentElement.parentElement;
                            <!-- 获取当前表格节点 -->
                            var table = document.getElementById("表格ID");
                            table.deleteRow(tr.rowIndex);
                        }
                    }
                }
                <!--限制键盘只能输指定范围内容  -->
                function checkInput(){
                    var kc = event.keyCode;
                    if(!((kc>=48 && kc<=57)||kc == 8||kc == 13)){
                        <!-- 取消输入内容 -->
                        event.returnValue=false;
                    }
                    if(kc == 13){
                        event.srcElement.blur();
                    }
                }
# 四、CS和BS模式
    (一)CS:客户端服务器架构模式
        优点:充分利用客户端机器的资源，减轻服务器的负荷
        缺点:
            1.需要安装客户端
            2.升级维护成本较高
    (二)BS:浏览器服务器架构模式
        优点:
            1.不需要安装客户端
            2.维护成本低
        缺点:
            所有任务都是放在客户端的，服务器负荷较重；在服务器端计算完成之后把结果再传输给客户端，因此客户端和服务器端会进行非常频繁的数据通信，从而网络负荷较重
# 五、WEB容器
    (一)Tomcat
        1.部署
        2.使用Servlet和前台交互
            前提
                (1)在web.xml里的<web-app>标签里设置映射关系，
                <servlet-class>标签填写java的继承了HttpServlet类的Servlet类的路径，<url-pattern>标签填写前台form的action的值，记得在此值前加上斜杆/
                    <servlet>
                        <servlet-name>AddServlet</servlet-name>
                        <servlet-class>com.zdy.servlet.AddServlet</servlet-class>
                    </servlet>
                    <servlet-mapping>
                        <servlet-name>AddServlet</servlet-name>
                        <url-pattern>/add</url-pattern>
                    </servlet-mapping>
                (2)导入依赖
                (3)Servlet类继承HttpServlet类
            使用
                [1](./JavaWeb_pic/doPost.PNG)
                <!-- 使用post方式需要设置编码；对于Tomcat8，如果使用的是get方式不需要设置编码，Tomcat8以下版本需要获取成字节数组，再根据自己需要给出的字符集进行转码 -->
                (1)设置编码
                <!-- 如果form表单使用的method属性是get，则调用doGet()方法，如果使用的method属性是post，则调用doPost()方法 --> 
                (2)获取参数
                    *1.HttpServletRequest.getParameter(String s):根据前台form表单的name属性获取内容
        3.状态码
            (1)404:找不到对应资源
            (2)405:请求方式不支持
            (3)500:服务器内部错误
            (4)200:正常响应
            (5)302:状态码
        4.Servlet的继承关系
            <!-- javax.servlet.Servlet接口 -->
                *1.void init(config):初始化方法
                *2.void service(request,response):服务方法
                    -->
                    <!-- javax.servlet.GenericServlet抽象类 -->
                        *1.abstract void service(request,response):仍然是抽象的
                        --> 
                            <!-- javax.servlet.http.HttpServlet抽象子类 -->
                                *1.void service(request,response):不是抽象的
                                    void service(request,response{
                                        String method = request.getMethod; //获取请求的方式(post/get/....),根据请求的方式不同而使用不同的do方法
                                    }
        5.servlet的生命周期
        <!--
            (1)void init(config):初始化方法
            (2)void service(request,response):服务方法
            (3)void destroy():销毁方法 
            -->
                <!-- 第一次接受请求时实例化、初始化，然后服务；从第二次请求开始，直接可以服务；当容器关闭时，其中所有的servlet实例会调用销毁方法销毁(一个类tomcat只会创建一个Servlet实例，所有的请求都是这个实例去响应) 
                默认情况下，第一次请求时，tomcat才会去实例化，初始化，然后在服务，这样提高了系统的启动速度，但是缺点是第一次请求时会耗时过长；如果需要提高响应速度，需要设计servlet的初始化时机，通过<load-on-startup><load-on-startup>标签设置servlet初始化时机，数字越小(优先级，容器启动就实例化)，启动越快-->
                [1](./JavaWeb_pic/load-on-startup.PNG)
        6.特点
            (1)servlet是单例的
            (2)servlet线程不安全(尽量不要在servlet中定义成员变量，如果不得不定义成员变量:
                [1]不要修改成员变量的值
                [2]不要用成员变量的值做逻辑判断
            )
        7.Servlet的初始化方法
            [1]获取config对象getServletConfig()
            [2]获取初始化参数值getServletConfig().getInitParameter(key)
            [3]xml配置初始化参数
                [1](./JavaWeb_pic/XML%E9%85%8D%E7%BD%AEServlet%E5%88%9D%E5%A7%8B%E5%8C%96%E5%8F%82%E6%95%B0%E5%80%BC.PNG)
            [4]注解方式配置初始化参数值
                [1](./JavaWeb_pic/%E6%B3%A8%E8%A7%A3%E9%85%8D%E7%BD%AEServlet%E5%88%9D%E5%A7%8B%E5%8C%96%E5%8F%82%E6%95%B0%E5%80%BC.PNG)
        8.获取Servlet中的ServletContext和<context-parm>
            (1)获取ServletContext
                [1]在初始化方法中获取
                    ServletContext servletContext = getServletContext();
                [2]在服务方法中获取
                    request.getServletContext();
                    或在session中获取
                    session.getServletContext();
# 六、HTTP协议(超文本传输协议)
    (一)作用：
        1.确定了请求和响应数据的格式
    (二)Http Request和Http Response
        1.Http Request:Http请求
            (1)请求行
                [1]请求方式
                [2]请求的url
                [3]请求的协议(一般都是HTTP1.1)
            (2)请求(消息)头
                包含很多客户端需要告诉服务器的信息
            (3)请求体
                两种形式：
                    [1]post:有请求体，form-data
                    [2]get方式：没有请求体，但有一个queryString
                    [3]json格式：有请求体，request payload
        2.响应
            (1)响应行
                [1]协议
                [2]响应状态码
                [3]响应状态
            (2)响应头
                [1]服务器版本号
                [2]内容的媒体类型
                [3]编码
                [4]....
            (3)响应体
                [1]响应的时机内容
    (三)特点：
        1.是无状态的：无法区分多次请求是否是同一个客户端发过来的还是不同客户端发过来的 --->会话跟踪技术Session ID的使用
            服务器端：
                (1)doPost/service/doGet方法里调用request.getSession()方法，获取会话返回值；如果获取不到，则创建一个新的，并自动返回Session ID给浏览器并保存到cookie中
                api:
                    <!-- 返回值.getId()方法可在后台获取Session ID -->
                    <!-- request.getSession(false):获取当前会话返回值，没有则返回null，不会创建新会话 -->
                    <!-- 返回值.isnew()判断当前session会话是否是新创建的 -->
                    <!--
                        1.返回值.getMaxInactiveInterval():获取会话的非激活间隔时长，默认1800秒(会话断开后失效的时间)
                        2.返回值.setMaxInactiveInterval():设置会话的非激活间隔时长
                        -->
                    <!-- 返回值.invalidate() 强制性让会话立即失效 -->
                    <!--  -->
        2.包含两部分：请求和响应
# 七、服务器内部转发以及客户端重定向
    (一)服务器内部转发：
        request.getRequestDispatcher("").forward(request,response);
    (二)客户端重定向(外部)
        response.sendRedirect("");
# 八、Thymeleaf(视图模板技术)
    (一)使用
        1.导入jar包
        2.在Web.xml里添加配置(配置上下文参数)
            [1](./JavaWeb_pic/%E9%85%8D%E7%BD%AE%E4%B8%8A%E4%B8%8B%E6%96%87%E5%8F%82%E6%95%B0.PNG)
        3.新建一个Servlet类ViewBaseServlet
        4.使用此技术的Servlet类继承ViewBaseServlet类
        5.查询数据并保存到作用域
        6.使用此技术的Servlet类调用super.processTemplate(String templateName, HttpServletRequest req, HttpServletResponse resp)方法
        7.在前端页面的标签里使用"th:..."引入此技术
    (二)流程控制
        (1)判断
            if:
                th:if="${#list.isEmpty(session.变量名)}"
            else:
                th:unless="${#session.变量名}"
        (2)循环迭代
            th:each="临时变量 : ${#session.变量名}"
        (3)设置标签内部的文本
            th:text="${fruit.fname}"
        (4)设置了此属性的标签内的th:text="${fruit.fname}"都可以不加fruit这样的前缀
            th:object="${fruit}"
        (5)此写法基于的是根目录
            th:xxx="@{/}"
        (6)设置点击事件
            th:onclick=""
# 九、作用域
    (一)保存作用域
        原始情况下，保存作用域可以认为有四个(级别)：
            1.page(页面级别，现在几乎不用)
            2.request(一次请求响应范围)
                <!-- 页面调用只需要写key -->
                    if:
                        th:if="${#list.isEmpty(变量名)}"
                    else:
                        th:unless="${#变量名}"
            3.session(一个会话范围)
                HttpSession session = request.getSession();
                session.setAttribute(String,String);
                <!-- 页面调用需要写session.变量名 -->
                    if:
                        th:if="${#list.isEmpty(session.变量名)}"
                    else:
                        th:unless="${#session.变量名}"
            4.application(整个应用程序范围)
                ServletContext 变量名 = request.getServletContext();
                变量名.setAttribute(String,String);
                <!-- 页面调用需要写application.变量名 -->
                    if:
                        th:if="${#list.isEmpty(application.变量名)}"
                    else:
                        th:unless="${#application.变量名}"
# 十、MVC(Model模型 + View视图 + Controller控制器)
    (一)模型层
        [1]模型分很多种
            1.比较简单的pojo/vo(值对象)
            2.DAO(数据访问对象)
            3.BO(业务对象)
        [2]区分DAO和BO
            1.DAO中的方法都是单精度方法，一个方法只考虑一个操作(细粒度方法)
            2.BO中的方法都是业务方法，实际的业务是复杂的，一般是多个DAO方法组合实现(粗粒度方法)
    (二)视图层
        用作做数据展示以及和用户交互的界面
    (三)控制层
        能够接受客户端的请求，具体的业务功能还要借助模型组件来完成
    <!--
    通过反射动态获取要使用的类
        (一)核心控制器
            @WebServlet("*.xxx")
        (二)Controller
        (三)配置文件XML
            <beans>
                这个bean标签的作用是将来servletpath中涉及的名字对对应的是id里的xxx，那么就要class中的路径里的文件处理
                <bean id="xxx" class="xxxx.xxxx.xxxx"/>
            </beans>
        (四)DispatcherServlet(核心控制器类)反射读取配置文件
        (五)反射动态获取方法和参数 
        -->
# 十一、IOC(控制翻转)
    (一)耦合/依赖
        设计原则：高内聚低耦合
# 十二、过滤器(Filter)
    (一)使用
        1.继承javax.servlet.Filter接口
        2.添加注解或者编写XML配置文件
            <!-- 注解WebServlet("")的值或XML文件<url-pattern>的值要和准备拦截的Servlet类一致 -->
        3.重写init、doFilter、destroy方法
        4.doFilter(ServletRequest,ServletResponse,FilterChain)方法
            (1)设置请求的过滤规则后在doFilter(ServletRequest,ServletResponse,FilterChain)方法里使用FilterChain.doFilter()方法放行
            (2)在FilterChain.doFilter()方法后设置响应的过滤规则
    (二)特性
        1.过滤器的拦截先后顺序
            在有多个过滤器类的情况下，哪个过滤器先拦截取决于：
                (1)使用注解方式，先后顺序取决于类名的排序
                (2)使用XML方式，取决于XML里配置的先后顺序
# 十三、监听器
    [1]类别
        <!-- Servlet监听器 -->
        (一)ServletContextListener
            1.作用：监听ServletContext对象的创建和销毁的过程
        (二)HttpSessionListener
            1.作用：监听HttpSession对象的创建和销毁
        (三)ServletRequestListener
            1.作用：监听ServletRequest对象的创建和销毁
        <!-- 作用域监听器-->
        (四)ServletContextAttributeListener
            1.作用：监听ServletContext的保存作用域的改动(add,remove,replace)
        (五)HttpSessionAttributeListener
            1.作用：监听HttpSession的保存作用域的改动(add,remove,replace)
        (六)ServletRequestAttributeListener
            1.作用：监听ServletRequest的保存作用域的改动(add,remove,replace)
        <!--特殊监听器-->
        (七)HttpSessionBindingListener
            1.作用：监听某个对象在Session域中的创建和移除
        (八)HttpSessionActivationListener
            1.作用：监听某个对象在Session域中的序列化和反序列化
    [2]使用
        1.注解方式
            (1)监听器类上标注注解@WebListener
            (2)继承所要使用的监听器类
        2.XML方式
            <listener>
                <listener-class>xxx.xxx.类名</listener-class>    
            </listener>
# 十四、事务
    (一)引入：
        service是一个整体，要么都成功，要么都失败--->
            事务管理不能一DAO层的单精度方法为单位，而应该以业务层的方法为单位
    (二)在Filter里使用事务
        1.ThreadLocal本地线程
            (1)set(Object):往线程里存储数据
                [1](./JavaWeb_pic/ThreadLocal%E7%9A%84set%E6%96%B9%E6%B3%95%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90.PNG)
            (2)get():从线程里获取数据
                [1](./JavaWeb_pic/ThreadLocal%E7%9A%84get%E6%96%B9%E6%B3%95%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90.PNG)
        2.从ThreadLocal本地线程里获取数据库连接
        3.setAutoCommit(false):关闭自动提交
        4.commit()提交事务和rollback()回滚事务
# 十五、XML
    (一)概念
        HTML:超文本标记语言
        XML:可扩展的标记语言
        <!-- HTML是XML的一个子集 -->
    (二)XML包含三个部分
        1.XML声明:必须存在且必须声明在第一行
            <?xml version="1.0" encoding="utf-8"?>
        2.DTD文档类型定义
        3.XML正文:必须存在
    (三)节点
        1.Node节点
            (1)Element 元素节点
            (2)Text 文本节点
# 十六、cookies
    (一)使用
        1.创建一个类继承HttpServlet类
        2.重写service方法
        3.创建Cookie
            Cookie cookie = new Cookie(String name,String value);
        4.将此cookie保存到浏览器
            response.addCookie(cookie);
        5.转发
            request.getRequestDispatcher("").forward(request,response);
    (二)有关Cookie的方法
        1.Cookie.setMaxAge(int second):设置Cookie的有效时长
        2.Cookie.setDomain(pattern):
        3.Cookie.setPath(String url):设置路径和服务器端进行比较，判断是否携带此Cookie
# 十七、正则表达式
    (一)使用
        1.对象形式:当表达式中有"/"就使用这种
            var reg = new RegExp("正则表达式");
        2.直接量形式:一般使用这种形式
            var reg = /正则表达式/;
    (二)匹配模式
        1.全文匹配
            var reg = /正则表达式/g;
        2.忽略大小写匹配
            var reg = /正则表达式/i;
        3.多行查找(识别换行符\n)
            <!-- &符表示以xxx结尾 -->
            var reg = /xxx&/m;
    (三)元字符
        [1](./JavaWeb_pic/%E5%85%83%E5%AD%97%E7%AC%A6.PNG)
    (四)字符集合
        <!-- 表示只要有abc种任意一个字符就能匹配 -->
        var reg = /[abc]/;
        <!-- ^表示取反，表示abc以外的任意字符 -->
        var reg = /[^abc]/;
        <!--  -表示范围，表示a到z的范围 -->
        var reg = /[a-z]/;
    (五)出现次数
        [1](./JavaWeb_pic/%E5%87%BA%E7%8E%B0%E6%AC%A1%E6%95%B0.PNG)
    (六)在正则表达式中表达[或者]
        [1](./JavaWeb_pic/%E5%9C%A8%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F%E4%B8%AD%E8%A1%A8%E8%BE%BE%5B%E6%88%96%E8%80%85%5D.PNG)
    (七)常用正则表达式
        [1](./JavaWeb_pic/%E5%B8%B8%E7%94%A8%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F.PNG)
# 十八、Ajax
    (一)使用
        1.在js文件里声明XMLHttpRequest
            var xmlHttpRequest;
            if(window.XMLHttpRequest){
                xmlHttpRequest = new XMLHttpRequest();
            }else if(window.ActiveXObject){
                <!--ie浏览器方式 -->
                try{
                    xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                }catch(e){
                    xmlHttpRequest = new ActiveXObject("Microsoft.Msxm12.XMLHTTP");
                }
            }
        2.发送请求的设置
            <!-- 三个参数分别是
                1.路径加请求参数
                2.请求方式
                3.是否是异步请求
                 -->
            xmlHttpRequest.open(String url,"GET"/"POST",true);
        3.设置回调函数
            xmlHttpRequest.onreadystatechange = ckUnameCB;
            function ckUnameCB(){
                if(xmlHttpRequest.readyState==4 && xmlHttpRequest.status==200){
                    //xmlHttpRequest.responseText 表示 服务器端响应给我的文本内容
                    var responseText = xmlHttpRequest.responseText;
                    if(responseText=="{'uname':'1'}"){
                        alert("用户名已经被注册！");
                    }else{
                        alert("用户名可以注册！");
                    }
                }
            }
        4.发送请求
            xmlHttpRequest.send();
# 十九、Vue在JavaWeb中的使用
    (一)使用
        1.将vue.js包导入Web文件夹
        2.在html文件head标签中的script标签中引入
            <script language="JavaScript" src="xxx/vue.js"></script>
        3.在js文件里或同一个html下的另一个script标签里声明：
            window.onload = function(){
                var vue = new Vue({
                    "el":"#样式表名",  
                    data:{
                        msg:"",
                        uname:"",
                        num:1,
                        num1:1,
                        num2:2,
                        num3:0,
                        fruitList:[
                            {fname:"",price:"",fcount:"",remark:""},
                            {fname:"",price:"",fcount:"",remark:""},
                            ...
                            {fname:"",price:"",fcount:"",remark:""},
                        ]
                    },
                    methods:{
                        myReverse:function(){}
                    },
                    watch:{
                        num1:function(newValue){
                            this.num3 = parseInt(newValue) + parseInt(this.num2);
                        }
                        num2:function(newValue){
                            this.num3 = parseInt(newValue) + parseInt(this.num1);
                        }
                    }
                });
            }
            (1)两种绑定方式
                <body>
                    <div id="样式表名">
                        <span>{{msg}}</span>  第一种绑定方式
                    </div>
                    <div id="样式表名">
                        <input :value="uname">     第二种绑定方式(v-bind:value或:value)
                    </div>
                </body>
            (2)双向绑定方式
                <body>
                    <div id="样式表名">
                        <input v-model="uname">     input会改变uname的值
                        <input v-model.trim="uname"> .trim会去掉uname的值得前后空格
                    </div>
                </body>
            (3)v-if和v-else
                可用于判断标签是否在页面显示
                <body>
                    <div id="样式表名">
                        <input v-id="num%2==0"> 两者之间不能有其他标签，且条件是相同的
                        <input v-else="num%2==0"> 
                    </div>
                </body>
            (4)v-for
                <body>
                    <div id="样式表名">
                        <table>
                            <tr>
                                <th>名称</th>
                                <th>单价</th>
                                <th>库存</th>
                                <th>备注</th>
                            </tr>
                            <tr v-for="fruit in fruitList">
                                <td>{{fruit.fname}}</td>
                                <td>{{fruit.price}}</td>
                                <td>{{fruit.fcount}}</td>
                                <td>{{fruit.remark}}</td>
                            </tr>
                        </table>
                    </div>
                </body>
            (5)v-on:click(也可写成@click)和methods:绑定点击事件
                <body>
                    <div id="样式表名">
                        <input type="button" v-on:click="myReverse">
                    </div>
                </body>
            (6)watch监视
                <body>
                    <div id="样式表名">
                        <input v-model="num1">
                        + 
                        <input v-model="num2">
                        =
                        <span>{{num3}}</span>
                    </div>
                </body>
            (7)生命周期函数
                [1](./JavaWeb_pic/vue%E5%AE%9E%E4%BE%8B%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F.PNG)
# 二十、axios
    (一)介绍：axios是一个Ajax框架
    (二)使用
        [1]发送普通异步信息
            1.将axios.js包导入Web文件夹
            2.在html文件head标签中的script标签中引入
                <script language="JavaScript" src="xxx/axios.js"></script>
            3.声明触发函数
                window.onload = function(){
                    var vue = new Vue({
                        "el":"#样式表名",
                        data:{
                            uname:"lina",
                            pwd:"ok"
                        },
                        methods:{
                            方法名:function(){
                                axios({
                                    method:"POST"或"GET",
                                    url:"",  <!--发送的路径-->
                                    params:{
                                        uname:vue.uname,
                                        pwd:vue.pwd
                                    }
                                })
                                    .then(function(value){
                                        <!-- 成功的回调函数 -->
                                    })
                                    .catch(function(reason){
                                        <!-- 有异常时的回调函数，获取服务器返回的异常 -->
                                        <!-- reason.data可以获取响应的信息 -->
                                        <!-- reason.message/reason.stack可以获取错误的信息 -->
                                    })
                            }
                        }
                    });
                }
                <body>
                    <div id="样式表名">
                        uname:<input type="text" v-model="uname">
                        pwd:<input type="text" v-model="pwd">
                        <input type="button" @click="方法名">
                    </div>
                </body>
        [2]发送json格式的异步信息
            1.后端接收json参数不使用getParameter()方法，而是:
                BufferReader reader = request.getReader();
                <!-- 创建StringBuilder对象来累加存储从请求体中读取的每一行 -->
                    StringBuilder builder = new StringBuilder();
                <!-- 声明临时变量 -->
                    String bufferStr = null;
                <!-- 循环读取 -->
                    while((bufferStr = reader.readLine())!=null){
                        bulider.append(bufferStr);
                    }
                <!-- 关闭流 -->
                    reader.close();
                <!-- 累加的结果就是整个请求体 -->
                    String requestBody = builder.toString();
                    <!-- 创建Gson对象用于解析JSON字符串 -->
                        Gson gson = new Gson();
                    <!-- 将JSON字符串还原为Java对象 -->
                        Student student = gson.fromJson(requestBody,Student.class);
                    <!-- Java对象转化为JSON格式 -->
                        String Json = gson.toJson(student);
                    <!-- 设置告诉客户端响应的内容是Json数据 -->
                        response.setcharacterEncoding("UTF-8");
                        response.setContentType("application/json;charset=utf-8");
                    <!-- 服务器端响应返回数据 -->
                    response.getWriter().write(Json);
            2.客户端解析Json数据
                window.onload = function(){
                    var vue = new Vue({
                        "el":"#样式表名",
                        data:{
                            uname:"lina",
                            pwd:"ok"
                        },
                        methods:{
                            方法名:function(){
                                axios({
                                    method:"POST"或"GET",
                                    url:"",  <!--发送的路径-->
                                    params:{
                                        uname:vue.uname,
                                        pwd:vue.pwd
                                    }
                                })
                                .then(function(value){
                                        <!--接受返回的Json字符串  -->
                                        var data = value.data;
                                        vue.uname = data.uname;
                                        vue.pwd = data.pwd;
                                        <!-- 如果返回的是普通字符串，js也提供了和普通字符串互转的API-->
                                        string JSON.stringify(object)<!--  object -> string   -->
                                        object JSON.parse(string)    <!--  string -> object   -->
                                    })
                                .catch(function(reason){
                                    <!-- 有异常时的回调函数，获取服务器返回的异常 -->
                                    <!-- reason.data可以获取响应的信息 -->
                                    <!-- reason.message/reason.stack可以获取错误的信息 -->
                                })
                            }
                        }
                    });
                }
                <body>
                    <div id="样式表名">
                        uname:<input type="text" v-model="uname">
                        pwd:<input type="text" v-model="pwd">
                        <input type="button" @click="方法名">
                    </div>
                </body>
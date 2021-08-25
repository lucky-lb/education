#项目链接头 1.117.99.174:8080
## user

#### user/login 登录

参数: mobile 手机号 ,password 密码

#### user/register 注册

参数:  mobile 手机号, password 密码

#### user/getMessage 获取用户信息

参数: mobile 手机号

#### user/updateMessage 修改用户的一般信息（不包括密码和手机号）

参数: user的所有参数，不上传的项保持原值

#### user/updateMobile 修改用户手机号

参数: oldMobile 旧手机号，newMobile 新手机号

#### user/updatePassword 修改用户密码

参数: mobile 手机号，oldPassword 旧密码，newPassword 新密码

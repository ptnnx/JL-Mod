\[ [English](README.md) | Russian \]

<h1 align="center">
    <a href="https://github.com/woesss/JL-Mod" target="_blank"></a>
        <img height="50%" width="50%" src="screenshots/icon.png"><br>
</h1>
<h4 align="center">Экпериментальный мод <a href="https://github.com/nikita36078/J2ME-Loader" target="_blank">J2ME Loader</a> с поддержкой игр, разработанных для 3D движка "Mascot Capsule v3"
</h4>

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/woesss/JL-Mod?style=plastic)](https://github.com/woesss/JL-Mod/releases/latest)
[![donate](https://img.shields.io/badge/donate-PayPal-%234D8A99?style=plastic)](https://www.paypal.me/j2meforever)
[![donate](https://img.shields.io/badge/donate-qiwi-%234D8A20?style=plastic)](https://my.qiwi.com/Yuryi-Khk_7vnCWvd)  

**[Скачать APK](https://github.com/woesss/JL-Mod/releases/latest)**

| <img src="screenshots/screen01.png" width="240"> | <img src="screenshots/screen02.png" width="240"> | <img src="screenshots/screen03.png" width="240"> |
| ----- | ----- | ----- |
| <img src="screenshots/screen04.png" width="240"> | <img src="screenshots/screen05.png" width="240"> | <img src="screenshots/screen06.png" width="240"> |
| <img src="screenshots/screen07.png" width="240"> | <img src="screenshots/screen08.png" width="240"> | <img src="screenshots/screen09.png" width="240"> |
| <img src="screenshots/screen10.png" width="240"> | <img src="screenshots/screen11.png" width="240"> | <img src="screenshots/screen12.png" width="240"> |

### **!!!Внимание!!!**
**В моде изменены некоторые настройки. J2ME Loader может работать неправильно с играми, шаблонами и настройками установленными или настроенными модом и наоборот. Что бы не пришлось переустанавливать-перенастраивать лучше сделать бекап, копию и не указывать рабочей папкой "J2ME-Loader" вообще.**

#### **Использование шйдеров (фильтры постобработки изображения)**

  Поддерживается формат шейдеров для [PPSSPP](https://www.ppsspp.org)
  Для использования нужно положить их в папку `shaders` в рабочей папке эмулятора,  
  далее в настройках игры выбрать режим вывода графики: **"Аппаратный ускорение (OpenGL ES)"** и выбрать интересующий шейдер.
  У некоторых шейдеров есть настройки - при выборе такого, рядом с названием появится иконка, при клике по ней откроется окошко с настройками
  Небольшую подборку совместимых шейдеров можно взять в этом рерозитории: [ppsspp_shaders](https://github.com/woesss/ppsspp_shaders)

#### **Поддержка Mascot Capsule v3**  
  реализация не точная, есть не решённые проблемы  

  В некоторых играх (замечено в "Medal of Honor") 3D-сцена может не отображаться из-за перекрытия 2D-фоном.  
  Попробуйте добавить в поле "Системные параметры" строку:  
  **micro3d.v3.render.no-mix2D3D: true**  
  Если не поможет - сообщите об этой игре в **[баг-репорт](https://github.com/woesss/JL-Mod/issues/new?assignees=&labels=bug&template=issue-template.md&title=)** или другим способом.

 Ещё один параметр включает фильтр текстур (встроенный в OpenGL), но это может порождать искажения в виде захвата лишних текселей по краям полигонов:  
 **micro3d.v3.texture.filter: true**  
 без этого параметра качество текстур максимально приближено к оригиналу и выглядит более винтажно.  

#### **Портирование**
 Добавлена возможность сборки приложения для Андроид из исходного кода J2ME приложения с использованием кода этого проекта.
 Подробнее в [Wiki](https://github.com/woesss/JL-Mod/wiki/Porting-midlet-instruction)

#### **Внешние ссылки**
 Emulation General Wiki:  
 [JL-Mod](http://emulation.gametechwiki.com/index.php/JL-Mod)  
 [Mascot Capsule 3D](http://emulation.gametechwiki.com/index.php/Mascot_Capsule_3D)  
 [Mascot Capsule 3D compatibility list](https://emulation.gametechwiki.com/index.php/Mascot_Capsule_3D_compatibility_list)  

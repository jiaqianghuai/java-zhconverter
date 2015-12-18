# Introduction #

Based on the character map found in MediaWiki to convert Java String between traditional and simplified Chinese characters


# Details #

```
// Instantiation will fetch the property file which load the Chinese character mappings
ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);

String simplifiedStr = converter.convert("有背光的機械式鍵盤");


// Or 
ZHConverter.convert("有背光的机械式键盘", ZHConverter.TRADITIONAL)
```

# Requirement #

The code is compiled against Java 1.3.
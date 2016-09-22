

DROP TABLE IF EXISTS `character`;

CREATE TABLE `character` (                      //��Ŀ�ص��
  `Charact_ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,                     
  PRIMARY KEY (`Charact_ID`)
)  


DROP TABLE IF EXISTS `difficulty`;
  
  
CREATE TABLE `difficulty` (                          //�Ѷ�ϵ����
  `Difficulty_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uplimit` double NOT NULL,                         //�Ѷ�����
  `Lowlimit` double NOT NULL,                       //�Ѷ�����
  PRIMARY KEY (`Difficulty_ID`)
)  

DROP TABLE IF EXISTS `grade`;                   
  
  
CREATE TABLE `grade` (                          //�꼶��
  `Crade_ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`Crade_ID`)
)  

DROP TABLE IF EXISTS `knowledge`;
  
  
CREATE TABLE `knowledge` (                         //֪ʶ���
  `Knowledge_ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `Subject_ID` int(11) NOT NULL,                   //��Ӧѧ��ID
  `Superior_ID` int(11) DEFAULT NULL,              //�ϼ�֪ʶ��ID
  PRIMARY KEY (`Knowledge_ID`)
)  


DROP TABLE IF EXISTS `questions`;
  
  
CREATE TABLE `questions` (                        //��Ŀ��
  `Questions_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Content` varchar(200) NOT NULL,                 //��Ŀ����
  `Subject_ID` int(11) NOT NULL,                   //��Ӧѧ��ID
  `Knowledge_ID1` int(11) DEFAULT NULL,            //��Ӧ֪ʶ��1
  `Knowledge_ID2` int(11) DEFAULT NULL,            //��Ӧ֪ʶ��2
  `Knowledge_ID3` int(11) DEFAULT NULL,            //��Ӧ֪ʶ��3
  `Knowledge_ID4` int(11) DEFAULT NULL,            //��Ӧ֪ʶ��4
  `Type_ID` int(11) NOT NULL,                      //��Ӧ����
  `Difficulty_ID` int(11) NOT NULL,                //��Ӧ�Ѷ�
  `Charact_ID` int(11) NOT NULL,                   //��Ӧ��Ŀ�ص�
  `Isdelete` tinyint(1) NOT NULL DEFAULT '0',      //״̬
  PRIMARY KEY (`Questions_ID`)
)  


DROP TABLE IF EXISTS `subject`;
  
  
CREATE TABLE `subject` (                        //ѧ�Ʊ�
  `Subject_ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `Grade_ID` int(11) NOT NULL,                   //��Ӧ�꼶
  PRIMARY KEY (`Subject_ID`)
)  


DROP TABLE IF EXISTS `type`;
  
  
CREATE TABLE `type` (                       //���ͱ�
  `Type_ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `Subject_ID` int(11) NOT NULL,             //��Ӧѧ��
  PRIMARY KEY (`Type_ID`)
)  

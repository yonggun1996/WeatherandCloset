# 기온별 옷차림을 알려주는 프로젝트 앱

## 기술 스택
 - androidstudio
 - kotlin언어
 - volley로 json 파싱

## 어떤 앱인가요?

#### 설정한 외출시간을 토대로 어떤옷을 입어야 할지 알려주는 앱 입니다.
#### 설정한 시간은 출근시간(학생이라면 등교시간), 퇴근시간(학생이라면 하교시간)을 설정을 할 수 있게 했습니다.
#### 설정하기 귀찮은 사람들을 위해 현재 시간으로 확인하는 기능을 추가했습니다.

## 어떤 옷을 입을지는 어떠한 기준으로 정했나요?

![기온별 옷차림 기준 이미지](https://user-images.githubusercontent.com/68115246/107111278-262e1400-6892-11eb-9761-858d941e836c.jpg)

### 외투
 - 패딩 / 두꺼운 코트(4℃ 이하)
 - 코트(0℃ ~ 8℃)
 - 가죽자켓(5℃ ~ 8℃)
 - 자켓 / 야상(9℃ ~ 16℃)
 - 트랜치코트(9℃ ~ 14℃)
 - 가디건 (12℃ ~ 19℃)
 - 얇은 가디건(18℃ ~ 22℃)

### 상의
#### 상의 같은 경우 4℃ 이하일 땐 따로 상의 데이터가 없습니다. 그래서 니트, 맨투맨은 낮은 날씨에도 입을 수 있게 설정했습니다.
 - 기모티셔츠 / 두꺼운니트(4℃ 이하)
 - 니트(16℃ 이하)
 - 맨투맨(19℃ 이하)
 - 긴 팔 / 긴 셔츠(18℃ ~ 22℃)
 - 얇은 니트(17℃ ~ 19℃)
 - 반팔 / 반셔츠/ 린넨셔츠(23℃ 이상)
 - 민소매 / 원피스(여성의 경우)(28℃ 이상)

### 하의
 - 기모바지 / 기모스타킹(여성의 경우)(4℃ 이하)
 - 재질이 두꺼운 바지(5℃ ~ 8℃)
 - 청바지(9℃ ~ 22℃)
 - 면바지(12℃ ~ 27℃)
 - 반바지 / 치마(여성의 경우)(28℃ 이상)


## 온도 측정은 어떻게 하나요?

1. 체감온도를 기준으로 알려줍니다.
2. 사람이 추위를 느낄 수 있는 온도는 9도 부터 입니다. 절반 이상의 시간이 9도 이하면 제일 추운 시간을 기준으로 알려줍니다.
3. 사람이 더위를 느낄 수 있는 온도는 26도 부터 입니다. 절반 이상의 시간이 26도 이상이면 제일 더운 시간을 기준으로 알려줍니다.
4. 그 외의 경우 설정한 시간들의 평균 기온으로 알려줍니다.

## 일교차 관련 사항입니다.
- 개요 : 곧 3월이 되가는 시점에서 일교차가 어느정도 있어 추천한 옷이 맞지 않을 경우가 있습니다. 그래서 다른 옷을 입는 것도 권유를 하는 기능을 추가해야 했습니다.
- 우선 일교차가 있다는 기준은 최고 온도와 최저 온도가 7도 이상 차이날 때 다른 옷도 추천합니다.
- 최저온도가 23도 이상이면 외투는 필요없기 때문에 굳이 계산을 안합니다.
- 최고온도가 4도 이하면 두꺼운 코트나 패딩을 입는것이 최선이기 때문에 굳이 계산을 안합니다.

### 일교차에 따른 옷차림
1. 더운 날일 경우 추위를 많이 타는 사람을 위해서 최저온도를 기준으로 다른 옷도 추천해줍니다.
2. 추운 날일 경우 더위를 많이 타는 사람을 위해서 최고온도를 기준으로 다른 옷도 추천해줍니다.
3. 봄이나 가을 같은 경우는 추위를 많이 타는 사람을 위해서 최저온도를 기준으로 옷을 추천해주고 더위를 많이 타는 사람을 위해서 최고온도를 기준으로 옷을 추천해줍니다.

## 기타적인 사항입니다.

1. 0도 이하일 경우 각종 방한도구를 챙기라고 권유합니다.
2. 1도 이상 9도 이하일 경우 추위를 느낄수도 있기 때문에 발열내의를 권유합니다.
3. 26도 이상 30도 이하의 경우 더위를 느낄수도 있기 때문에 꽉 끼는 옷을 추천하지 않습니다.
4. 31도 이상일 경우 통풍이 잘 되는 옷이나 밝은 계열의 옷을 추천합니다.
5. 그 외의 경우 일교차가 7도 이상 차이가 난다면 겉옷을 챙기라고 권유합니다.


## 코드를 짜면서 새로 알게된 점은 무엇인가요?

1. 사용자에게 위치를 가져오는 권한을 가져오는것에 대해 알게 되었습니다.
  도움이 된 사이트 : https://manorgass.tistory.com/74
2. OpenWeatherMapAPI에서 제공하는 JSON데이터를 Volley로 파싱하는 방법을 알게 되었습니다.
  도움이 된 사이트 : https://www.youtube.com/watch?v=y2xtLqP8dSQ
  데이터 읽는 방법을 알게된 사이트 : https://kkangsnote.tistory.com/44
3. RecyclerView를 만들어 가로로 보여주게 하는 법을 알게 되었습니다.
  도움이 된 사이트 : https://dalgonakit.tistory.com/138
4. 다른 사이트에서 글꼴을 다운받아 적용하는 법을 알게 되었습니다.
  도움이 된 사이트 : https://bongcando.tistory.com/12
  글꼴을 얻어온 사이트 : http://levelup.nexon.com/font/index.aspx?page=5
5. 다크모드를 적용하는 방법을 알게 되었습니다.
   https://developer.android.com/guide/topics/ui/look-and-feel/darktheme?hl=ko
   style 태그에 Theme.AppCompat.DayNight를 입력하면 다크모드가 되긴 하지만 글자의 색이랑 배경이랑 잘 어울리지 않아 또 다른 방법을 알아봤습니다.
   https://yunaaaas.tistory.com/18
   저는 사용자가 핸드폰에서 설정할 때 바뀌게끔 했습니다.ㅅ습
6. Viewpager2를 사용하는 방법을 알게 되었습니다. 저는 처음 설치했을때 앱에대한 설명을 해주기 위해 Viewpager2를 사용했습니다.
   알게되는데 큰 도움이 된 블로그 : https://choheeis.github.io/newblog//articles/2020-08/ViewPager2

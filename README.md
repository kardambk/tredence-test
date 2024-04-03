# tredence-test

## External APIs
### POST - ```http://localhost:2000/query/S-1000/1?category=Milk&brand=Juice&productId=MJ-373746711&sortBy=category&order=desc```
#### All query parameters are optional.
## Internel APIs
### POST - ```http://localhost:2000/product```
#### Headers: ```Content-Type - application/json```
#### Payload:
```json
[
  {
    "productId": "BG-419110951",
    "category": "Babies",
    "brand": "Girlds"
  },
  {
    "productId": "BG-419110952",
    "category": "Babies",
    "brand": "Girlds"
  },
  {
    "productId": "BG-419110953",
    "category": "Babies",
    "brand": "Girlds"
  },
  {
    "productId": "BB-2144746855",
    "category": "Babies",
    "brand": "Babyom"
  },
  {
    "productId": "BB-2144746856",
    "category": "Babies",
    "brand": "Babyom"
  },
  {
    "productId": "BB-2144746857",
    "category": "Babies",
    "brand": "Babyom"
  },
  {
    "productId": "BM-1173639537",
    "category": "Babies",
    "brand": "Mommers"
  },
  {
    "productId": "BM-1173639538",
    "category": "Babies",
    "brand": "Mommers"
  },
  {
    "productId": "BM-1173639539",
    "category": "Babies",
    "brand": "Mommers"
  },
  {
    "productId": "BC-989301223",
    "category": "Babies",
    "brand": "Childer"
  },
  {
    "productId": "BC-989301224",
    "category": "Babies",
    "brand": "Childer"
  },
  {
    "productId": "BC-989301225",
    "category": "Babies",
    "brand": "Childer"
  },
  {
    "productId": "MM-749337358",
    "category": "Milk",
    "brand": "Milkcask"
  },
  {
    "productId": "MM-749337359",
    "category": "Milk",
    "brand": "Milkcask"
  },
  {
    "productId": "MM-749337360",
    "category": "Milk",
    "brand": "Milkcask"
  },
  {
    "productId": "MJ-373746709",
    "category": "Milk",
    "brand": "Juice"
  },
  {
    "productId": "MJ-373746710",
    "category": "Milk",
    "brand": "Juice"
  },
  {
    "productId": "MJ-373746711",
    "category": "Milk",
    "brand": "Juice"
  },
  {
    "productId": "MD-543564695",
    "category": "Milk",
    "brand": "Dairylounge"
  },
  {
    "productId": "MD-543564696",
    "category": "Milk",
    "brand": "Dairylounge"
  },
  {
    "productId": "MD-543564697",
    "category": "Milk",
    "brand": "Dairylounge"
  },
  {
    "productId": "MB-2093193397",
    "category": "Milk",
    "brand": "Berrycow"
  },
  {
    "productId": "MB-2093193398",
    "category": "Milk",
    "brand": "Berrycow"
  },
  {
    "productId": "MB-2093193399",
    "category": "Milk",
    "brand": "Berrycow"
  },
  {
    "productId": "ST-348265157",
    "category": "Sports",
    "brand": "Trand"
  },
  {
    "productId": "ST-348265158",
    "category": "Sports",
    "brand": "Trand"
  },
  {
    "productId": "ST-348265159",
    "category": "Sports",
    "brand": "Trand"
  },
  {
    "productId": "SB-51995577",
    "category": "Sports",
    "brand": "Ballshop"
  },
  {
    "productId": "SB-51995578",
    "category": "Sports",
    "brand": "Ballshop"
  },
  {
    "productId": "SB-51995579",
    "category": "Sports",
    "brand": "Ballshop"
  },
  {
    "productId": "SC-860550237",
    "category": "Sports",
    "brand": "Crumyard"
  },
  {
    "productId": "SC-860550238",
    "category": "Sports",
    "brand": "Crumyard"
  },
  {
    "productId": "SC-860550239",
    "category": "Sports",
    "brand": "Crumyard"
  },
  {
    "productId": "SS-1529984359",
    "category": "Sports",
    "brand": "Sportf"
  },
  {
    "productId": "SS-1529984360",
    "category": "Sports",
    "brand": "Sportf"
  },
  {
    "productId": "SS-1529984361",
    "category": "Sports",
    "brand": "Sportf"
  },
  {
    "productId": "VV-1280808854",
    "category": "Vegan",
    "brand": "Veganoid"
  },
  {
    "productId": "VV-1280808855",
    "category": "Vegan",
    "brand": "Veganoid"
  },
  {
    "productId": "VV-1280808856",
    "category": "Vegan",
    "brand": "Veganoid"
  },
  {
    "productId": "VT-246442909",
    "category": "Vegan",
    "brand": "Tarcrop"
  },
  {
    "productId": "VT-246442910",
    "category": "Vegan",
    "brand": "Tarcrop"
  },
  {
    "productId": "VT-246442911",
    "category": "Vegan",
    "brand": "Tarcrop"
  },
  {
    "productId": "VB-1890577306",
    "category": "Vegan",
    "brand": "Beanut"
  },
  {
    "productId": "VB-1890577307",
    "category": "Vegan",
    "brand": "Beanut"
  },
  {
    "productId": "VB-1890577308",
    "category": "Vegan",
    "brand": "Beanut"
  },
  {
    "productId": "VA-1329167330",
    "category": "Vegan",
    "brand": "Avocadow"
  },
  {
    "productId": "VA-1329167331",
    "category": "Vegan",
    "brand": "Avocadow"
  },
  {
    "productId": "VA-1329167332",
    "category": "Vegan",
    "brand": "Avocadow"
  }
]
```

### POST - ```http://localhost:2000/shopper-product```
#### Headers: ```Content-Type - application/json```
#### Payload:
```json
[
  {
    "shopperId": "S-1000",
    "shelf": [
      {
        "productId": "MB-2093193398",
        "relevancyScore": 31.089209569320897
      },
      {
        "productId": "VV-1280808856",
        "relevancyScore": 55.16626010671777
      },
      {
        "productId": "MD-543564697",
        "relevancyScore": 73.01492966268303
      },
      {
        "productId": "BB-2144746855",
        "relevancyScore": 4.465418091552332
      },
      {
        "productId": "MB-2093193397",
        "relevancyScore": 81.86596372052234
      },
      {
        "productId": "SC-860550238",
        "relevancyScore": 80.39179367642213
      },
      {
        "productId": "BG-419110952",
        "relevancyScore": 17.06951788069343
      },
      {
        "productId": "BM-1173639537",
        "relevancyScore": 67.02308880778921
      },
      {
        "productId": "MJ-373746710",
        "relevancyScore": 5.732323263667915
      },
      {
        "productId": "SS-1529984359",
        "relevancyScore": 82.6173683756812
      },
      {
        "productId": "MJ-373746711",
        "relevancyScore": 83.6325837366619
      },
      {
        "productId": "BC-989301224",
        "relevancyScore": 6.778058627746741
      },
      {
        "productId": "BB-2144746857",
        "relevancyScore": 85.39314011525776
      },
      {
        "productId": "VA-1329167330",
        "relevancyScore": 67.76365858050977
      },
      {
        "productId": "SB-51995577",
        "relevancyScore": 46.014451739635916
      }
    ]
  },
  {
    "shopperId": "S-1001",
    "shelf": [
      {
        "productId": "MD-543564695",
        "relevancyScore": 64.9399444667783
      },
      {
        "productId": "BB-2144746857",
        "relevancyScore": 53.57797793220851
      },
      {
        "productId": "VT-246442909",
        "relevancyScore": 21.288534107744482
      },
      {
        "productId": "VA-1329167330",
        "relevancyScore": 27.014437875539265
      },
      {
        "productId": "SS-1529984359",
        "relevancyScore": 62.1324134409292
      },
      {
        "productId": "BM-1173639539",
        "relevancyScore": 44.137367556050236
      },
      {
        "productId": "MM-749337360",
        "relevancyScore": 6.856912727184749
      },
      {
        "productId": "ST-348265157",
        "relevancyScore": 39.775934624141605
      },
      {
        "productId": "VB-1890577308",
        "relevancyScore": 96.8131613220743
      },
      {
        "productId": "BG-419110953",
        "relevancyScore": 4.430050876459301
      },
      {
        "productId": "VT-246442911",
        "relevancyScore": 99.38024632323383
      },
      {
        "productId": "VV-1280808854",
        "relevancyScore": 2.4611321887394677
      },
      {
        "productId": "MM-749337358",
        "relevancyScore": 24.346224227541345
      },
      {
        "productId": "MM-749337359",
        "relevancyScore": 58.574240950900524
      },
      {
        "productId": "MD-543564696",
        "relevancyScore": 37.505474308360355
      }
    ]
  },
  {
    "shopperId": "S-1002",
    "shelf": [
      {
        "productId": "VA-1329167330",
        "relevancyScore": 19.492734899351294
      },
      {
        "productId": "BB-2144746855",
        "relevancyScore": 52.970581137195005
      },
      {
        "productId": "SB-51995577",
        "relevancyScore": 71.96790001671006
      },
      {
        "productId": "SC-860550238",
        "relevancyScore": 43.95637045922845
      },
      {
        "productId": "ST-348265158",
        "relevancyScore": 63.53588332610439
      },
      {
        "productId": "VB-1890577306",
        "relevancyScore": 28.318408103977355
      },
      {
        "productId": "MD-543564697",
        "relevancyScore": 96.8270084353957
      },
      {
        "productId": "VV-1280808855",
        "relevancyScore": 9.605985097277658
      },
      {
        "productId": "MM-749337358",
        "relevancyScore": 51.47881070494537
      },
      {
        "productId": "MB-2093193399",
        "relevancyScore": 97.79320043226103
      },
      {
        "productId": "BC-989301223",
        "relevancyScore": 22.951332705537688
      },
      {
        "productId": "BG-419110953",
        "relevancyScore": 42.45475417967195
      },
      {
        "productId": "MD-543564695",
        "relevancyScore": 81.82907115868066
      },
      {
        "productId": "SS-1529984359",
        "relevancyScore": 20.116106438128845
      },
      {
        "productId": "MB-2093193398",
        "relevancyScore": 91.64193020313606
      }
    ]
  },
  {
    "shopperId": "S-1003",
    "shelf": [
      {
        "productId": "MM-749337359",
        "relevancyScore": 9.285784508856453
      },
      {
        "productId": "VB-1890577308",
        "relevancyScore": 42.69865877013647
      },
      {
        "productId": "BB-2144746855",
        "relevancyScore": 51.652597645133206
      },
      {
        "productId": "VB-1890577306",
        "relevancyScore": 53.549240984667016
      },
      {
        "productId": "BG-419110952",
        "relevancyScore": 60.062975207288915
      },
      {
        "productId": "BM-1173639539",
        "relevancyScore": 63.844337249273266
      },
      {
        "productId": "SC-860550238",
        "relevancyScore": 12.045177782886729
      },
      {
        "productId": "MM-749337360",
        "relevancyScore": 62.348573774809225
      },
      {
        "productId": "VT-246442911",
        "relevancyScore": 19.421445338673916
      },
      {
        "productId": "SB-51995578",
        "relevancyScore": 50.23350517638963
      },
      {
        "productId": "BC-989301225",
        "relevancyScore": 76.10965733312545
      },
      {
        "productId": "BB-2144746856",
        "relevancyScore": 3.668377020508895
      },
      {
        "productId": "BM-1173639537",
        "relevancyScore": 65.53309644268158
      },
      {
        "productId": "MM-749337358",
        "relevancyScore": 99.01865852867185
      },
      {
        "productId": "BC-989301223",
        "relevancyScore": 1.0846539140113576
      }
    ]
  },
  {
    "shopperId": "S-1004",
    "shelf": [
      {
        "productId": "BM-1173639537",
        "relevancyScore": 87.44404516029063
      },
      {
        "productId": "VB-1890577307",
        "relevancyScore": 82.79179867042755
      },
      {
        "productId": "VT-246442909",
        "relevancyScore": 73.9644416081247
      },
      {
        "productId": "BB-2144746855",
        "relevancyScore": 69.42747936618181
      },
      {
        "productId": "VB-1890577308",
        "relevancyScore": 25.81144046082404
      },
      {
        "productId": "ST-348265157",
        "relevancyScore": 80.35799873926712
      },
      {
        "productId": "MB-2093193397",
        "relevancyScore": 38.30020871138008
      },
      {
        "productId": "MD-543564696",
        "relevancyScore": 53.008430263420216
      },
      {
        "productId": "MJ-373746709",
        "relevancyScore": 38.108616670630326
      },
      {
        "productId": "VA-1329167332",
        "relevancyScore": 31.61708483693215
      },
      {
        "productId": "SS-1529984359",
        "relevancyScore": 36.0226464541305
      },
      {
        "productId": "MB-2093193399",
        "relevancyScore": 66.72664648565359
      },
      {
        "productId": "BC-989301225",
        "relevancyScore": 2.5494342826014704
      },
      {
        "productId": "MD-543564695",
        "relevancyScore": 91.11862453341534
      },
      {
        "productId": "SC-860550237",
        "relevancyScore": 18.570109269156355
      },
      {
        "productId": "SC-860550237",
        "relevancyScore": 30.737805376096695
      }
    ]
  }
]
```
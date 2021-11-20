# Bill REST-API



 [Click here](https://infinx-bill-api.herokuapp.com/) to start using the api.

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/rohit-sawant/Infinix-Bill-Api.git 
$ cd Infinix-Bill-Api
$ mvn install
$ heroku local web
```
Your app should now be running on [localhost:5000](http://localhost:5000/).



## Documentation


## Get list of Bills

### Request

`GET https://infinx-bill-api.herokuapp.com/bills`

    https://infinx-bill-api.herokuapp.com/bills

### Response

    [{
        "billNumber": 1,
        "billTo": "rohit",
        "date": "2021-11-20",
        "price": 200,
        "tax": 10,
        "totalAmount": 220
    },
    {
        "billNumber": 2,
        "billTo": "rohit",
        "date": "2021-11-20",
        "price": 200,
        "tax": 10,
        "totalAmount": 220
    }]

## Get a specific Bill with id

### Request

`GET https://infinx-bill-api.herokuapp.com/bills/id`

    https://infinx-bill-api.herokuapp.com/bills/1

### Response

    {
        "billNumber": 1,
        "billTo": "rohit",
        "date": "2021-11-20",
        "price": 200,
        "tax": 10,
        "totalAmount": 220
    }

## Get a specific Bill with due date

### Request

`GET https://infinx-bill-api.herokuapp.com/bills/due/date`

    https://infinx-bill-api.herokuapp.com/bills/due/20-11-2021

### Response

    {
        "billNumber": 1,
        "billTo": "rohit",
        "date": "2021-11-20",
        "price": 200,
        "tax": 10,
        "totalAmount": 220
    }

## Add a specific bill
### Request
Add body in the request in the same format mentioned below\
`POST https://infinx-bill-api.herokuapp.com/bills/`

    https://infinx-bill-api.herokuapp.com/bills/

    {
        "billNumber": 2,
        "billTo": "shrushti",
        "date": "2021-11-20",
        "price": 200,
        "tax": 10,
        "totalAmount": 220
    }
### Response

    {
        "billNumber": 2,
        "billTo": "shrushti",
        "date": "2021-11-20",
        "price": 200,
        "tax": 10,
        "totalAmount": 220
    }



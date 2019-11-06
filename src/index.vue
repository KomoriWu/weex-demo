<template>
    <div class="wrapper">
        <img :src="logo" class="logo"/>
        <text class="greeting">The environment is ready!</text>
        <HelloWorld/>
        <!--        <a href="/dist/RecycleList.js">-->
        <div @click="toast">
            <text class="jump">jump</text>
        </div>
        <!--        </a>-->
    </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld'
const globalEvent = weex.requireModule('globalEvent')
const testModule = weex.requireModule('ToastModule')
export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data () {
    return {
      logo: 'https://gw.alicdn.com/tfs/TB1yopEdgoQMeJjy1XaXXcSsFXa-640-302.png'
    }
  },

  methods: {
    toast: function () {
      testModule.showToast('hello android toast', function (s) {
        testModule.log(s)
      })
    },
    addGlobalObserver () {
      globalEvent.addEventListener('main', function (e) {
        testModule.log('ssssss')
      })
    }
  }
}

</script>

<style scoped>
    .wrapper {
        justify-content: center;
        align-items: center;
    }

    .logo {
        width: 424px;
        height: 200px;
    }

    .greeting {
        text-align: center;
        margin-top: 70px;
        font-size: 50px;
        color: #41B883;
    }

    .message {
        margin: 30px;
        font-size: 32px;
        color: #727272;
    }

    .jump {
        width: 200px;
        color: white;
        margin: 30px;
        text-align: center;
        font-size: 30px;
        background-color: #00B4FF;
        padding: 20px;
    }
</style>

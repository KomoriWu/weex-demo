<template>
    <div class="wrapper">
        <image :src="logo" class="logo"/>
        <text class="greeting">The environment is ready!</text>
        <HelloWorld/>
        <a href="/dist/list.js">
            <text class="jump">jump</text>
        </a>
    </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data () {
    return {
      logo: 'https://gw.alicdn.com/tfs/TB1yopEdgoQMeJjy1XaXXcSsFXa-640-302.png'
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

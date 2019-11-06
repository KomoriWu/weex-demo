<!--<template>-->
<!--    <list show-scrollbar=true>-->
<!--        <refresh  class="refresh" @refresh="onRefresh" @pullingdown="onpullingdown" :display="refreshing ? 'show' : 'hide'">-->
<!--            <text class="refresh text">Refreshing...</text>-->
<!--            <loading-indicator class="indicator"></loading-indicator>-->
<!--        </refresh>-->
<!--        <cell v-for="num in list" class="row">-->
<!--            <text class="item">{{num}}</text>-->
<!--        </cell>-->
<!--        <loading >-->
<!--            <text class="loading">Loading</text>-->
<!--        </loading>-->
<!--    </list>-->
<!--</template>-->

<!--<script>-->
<!--const modal = weex.requireModule('modal')-->
<!--export default {-->
<!--  name: 'list',-->
<!--  data () {-->
<!--    return {-->
<!--      refreshing: false,-->
<!--      list: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]-->
<!--    }-->
<!--  },-->
<!--  methods: {-->
<!--    onRefresh (e) {-->
<!--      this.refreshing = true-->
<!--      modal.toast({ message: 'Refreshing', duration: 1 })-->
<!--      setTimeout(() => {-->
<!--        this.refreshing = false-->
<!--      }, 2000)-->
<!--    }-->
<!--  }-->

<!--}-->
<!--</script>-->

<!--<style scoped>-->
<!--    .row {-->
<!--        margin-top: 10px;-->
<!--        align-items: center;-->
<!--    }-->

<!--    .item {-->
<!--        text-align: center;-->
<!--        margin-top: 10px;-->
<!--        align-items: center;-->
<!--        width: 200px;-->
<!--        padding-top: 30px;-->
<!--        padding-bottom: 30px;-->
<!--        color: white;-->
<!--        background-color: #41B883;-->
<!--    }-->

<!--    .refresh{-->
<!--        align-items: center;-->
<!--    }-->
<!--    .text{-->
<!--        padding: 20px;-->
<!--        color:green;-->
<!--        text-align: center;-->
<!--        font-size: 30px;-->
<!--    }-->
<!--    .loading{-->
<!--        padding: 20px;-->
<!--        color:green;-->
<!--        text-align: center;-->
<!--        font-size: 30px;-->
<!--    }-->
<!--    .indicator{-->
<!--        height: 40px;-->
<!--        width: 40px;-->
<!--        color: #41B883;-->
<!--    }-->
<!--</style>-->
